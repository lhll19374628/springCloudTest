package com.example.cloudclient.service;

/**
 * @author LINKEYI
 * @date 2021/12/01/10:54
 */
//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cloud-provider",path ="/hello" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface HelloService {
    @RequestMapping(value = "getHello")
    String getProduct();
}
