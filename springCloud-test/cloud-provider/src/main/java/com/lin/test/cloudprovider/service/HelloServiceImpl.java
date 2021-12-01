package com.lin.test.cloudprovider.service;

import org.springframework.stereotype.Service;

/**
 * @author LINKEYI
 * @date 2021/12/01/10:40
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String getHello() {
        return "你好兄弟";
    }
}
