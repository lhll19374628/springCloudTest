package com.lin.test.cloudprovider.controller;

import com.lin.test.cloudprovider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LINKEYI
 * @date 2021/12/01/10:39
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/getHello")
    public String getHello(){

        return helloService.getHello();
    }

}
