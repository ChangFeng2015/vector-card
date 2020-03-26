package com.qiqilab.dao;

import com.qiqilab.entity.Employee;
import org.springframework.stereotype.Repository;

/**
 * demo
 *
 * @author Dave
 */
@Repository
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}