package com.qiqilab.dao;

import com.qiqilab.entity.Credence;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CredenceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Credence record);

    int insertSelective(Credence record);

    Credence selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Credence record);

    int updateByPrimaryKey(Credence record);

    List<Credence> selectByPage();
}