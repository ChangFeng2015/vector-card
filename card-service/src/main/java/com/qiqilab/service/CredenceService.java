package com.qiqilab.service;

import com.qiqilab.entity.Credence;

import java.util.List;

public interface CredenceService {

    List<Credence> selectByPage();

    int insertSelective(Credence record);
}
