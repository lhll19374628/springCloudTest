package com.example.cloudclient.controller;

import com.example.cloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LINKEYI
 * @date 2021/12/01/10:53
 */
@RestController
@RequestMapping("/Hello")
public class HelloClient {
    @Autowired
    private HelloService helloService;

    @GetMapping("/getClient")
    public String getClient(){
        return helloService.getProduct();
    }

}
