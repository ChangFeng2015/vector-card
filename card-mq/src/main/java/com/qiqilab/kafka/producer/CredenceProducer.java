package com.qiqilab.kafka.producer;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qiqilab.entity.Credence;
import com.qiqilab.service.CredenceService;
import com.qiqilab.service.IDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.List;

@Component
public class CredenceProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Autowired
    CredenceService credenceService;
    @Autowired
    IDService idService;


    public void sendMessage() {
        Gson gson = new GsonBuilder().create();
        PageHelper.startPage(1, 30, "id desc");
        List<Credence> credenceList = credenceService.selectByPage();
        PageInfo page = new PageInfo(credenceList);
        for (Credence credence : credenceList) {
            String message = gson.toJson(credence);
            ListenableFuture<SendResult<String, String>> future =
                    kafkaTemplate.send("yinshan_credence", idService.getNextID(), message);

            future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

                @Override
                public void onSuccess(SendResult<String, String> result) {
                    System.out.println("Sent message=[" + message +
                            "] with offset=[" + result.getRecordMetadata().offset() + "]");
                }

                @Override
                public void onFailure(Throwable ex) {
                    System.out.println("Unable to send message=["
                            + message + "] due to : " + ex.getMessage());
                }
            });
        }

    }

    public void sendMessage(String topicName, String message) {
        ListenableFuture<SendResult<String, String>> future =
                kafkaTemplate.send(topicName, idService.getNextID(), message);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {

            }

            @Override
            public void onFailure(Throwable ex) {

            }
        });

    }

}
