package com.qiqilab.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.qiqilab.dao.EmployeeMapper;
import com.qiqilab.entity.Employee;
import com.qiqilab.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dave
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    @DS("slave_1")
    public Employee getEmplyeeById(int id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @DS("slave_1")
    @Override
    public int saveEmployee(Employee record) {
        return employeeMapper.insertSelective(record);
    }
}
