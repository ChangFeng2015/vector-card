package com.qiqilab.service.impl;

import com.qiqilab.service.IDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class RedisSegmentIDService implements IDService {

    RedisAtomicLong atomicLong;

    AtomicLong currentId = new AtomicLong(-1L);
    AtomicLong start = new AtomicLong(-1L);
    AtomicLong end = new AtomicLong(-1L);

    @Autowired
    public RedisSegmentIDService(RedisTemplate<String, Long> idTemplate) {
        this.atomicLong = new RedisAtomicLong("counter", idTemplate, 0L);
    }

    @Override
    public String getNextID() {
        if (currentId.get() > end.get()) {
            getNextSegment();
        }

        long tempId = currentId.get();
        while (!currentId.compareAndSet(tempId, tempId + 1)) {
            tempId = currentId.get();
        }
        return String.valueOf(System.currentTimeMillis() + tempId + 1);
    }

    private void getNextSegment2() {
        long tempEnd = end.get();
        //同时进入 if 条件可能造成 redis 申请了一批但是由于 CAS 放弃了。可以考虑将方法加锁，毕竟申请操作频度低很多，while 循环还需要浪费判断条件。
        while (currentId.get() > end.get()) {
            if (end.compareAndSet(tempEnd, atomicLong.addAndGet(1000))) {
                start = new AtomicLong(end.get() - 1000);
            }
        }
    }

    private synchronized void getNextSegment() {
        if (currentId.get() > end.get()) {
            end.set(atomicLong.addAndGet(1000));
            start = new AtomicLong(end.get() - 1000);
        }
    }
}
