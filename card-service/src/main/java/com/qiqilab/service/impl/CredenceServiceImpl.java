package com.qiqilab.service.impl;

import com.qiqilab.dao.CredenceMapper;
import com.qiqilab.entity.Credence;
import com.qiqilab.service.CredenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredenceServiceImpl implements CredenceService {

    @Autowired
    CredenceMapper credenceMapper;

    @Override
    public List<Credence> selectByPage() {
        return credenceMapper.selectByPage();
    }
}
