package com.learn.oauth2.pwdgrant.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Value("${application.name}")
    private String appName;

    @GetMapping("test")
    public Object testController(){
        Map<String, Object> map = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        map.put("Welcome to",appName);
        map.put("Time now",sdf.format(new Date()));

        return map;
    }
}
