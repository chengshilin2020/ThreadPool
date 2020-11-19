package com.example.configbean.controller;

import com.example.configbean.config.MapperProxy;
import com.example.configbean.entity.User;
import com.example.configbean.service.UserMapper;

public class pro {
    public static void main(String[] args) {
        MapperProxy proxy = new MapperProxy();

        UserMapper mapper = proxy.newInstance(UserMapper.class);
        User user = mapper.getUserById(1001);

        System.out.println("ID:" + user.getId());
        System.out.println("Name:" + user.getName());
        System.out.println("Age:" + user.getAge());

        System.out.println(mapper.toString());
    }
}
