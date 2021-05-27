package com.qiqilab.web.hello;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qiqilab.entity.Credence;
import com.qiqilab.entity.Employee;
import com.qiqilab.exception.EmployeeNotExistException;
//import com.qiqilab.kafka.producer.CredenceProducer;
import com.qiqilab.service.CredenceService;
import com.qiqilab.service.HelloService;
import com.qiqilab.service.IDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;


/**
 * demo
 *
 * @author Dave
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    IDService idService;

//    @Autowired
//    CredenceProducer credenceProducer;

    @Autowired
    CredenceService credenceService;

    @GetMapping("test")
    public void hello() {
        boolean hasNextPage = true;
        int pageNum = 1;
        while (hasNextPage) {
            Gson gson = new GsonBuilder().create();
            PageHelper.startPage(pageNum ++, 30, "id desc");
            List<Credence> credenceList = credenceService.selectByPage();
            PageInfo page = new PageInfo(credenceList);
            for (Credence credence : credenceList) {
                String message = gson.toJson(credence);
//                credenceProducer.sendMessage("yinshan_credence_4", message);
            }
            hasNextPage = page.isHasNextPage();
        }

    }

    @GetMapping("/{id}")
    public Employee EmployeeInfo(@PathVariable int id) {
        Employee employee = helloService.getEmplyeeById(id);
        if (Objects.isNull(employee)) {
            throw new EmployeeNotExistException(id);
        }
        return employee;
    }

    @PostMapping("/save")
    public Employee saveEmployee(@Valid Employee employee) {
        employee.setId(Integer.parseInt(idService.getNextID()));
        helloService.saveEmployee(employee);
        return employee;
    }

    @GetMapping("/")
    public String index() {

        return "success";
    }

}
