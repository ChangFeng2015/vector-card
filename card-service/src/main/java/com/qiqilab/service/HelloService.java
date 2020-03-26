package com.qiqilab.service;

import com.qiqilab.entity.Employee;

/**
 * demo
 *
 * @author Dave
 */

public interface HelloService {

    /**
     * 根据id获取雇员的信息
     *
     * @param id
     * @return
     */
    Employee getEmplyeeById(int id);

    int saveEmployee(Employee record);

}
