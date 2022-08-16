package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.bean.Limit;
import com.in28minutes.microservices.limitsservice.controller.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    private Limit retrieveLimits(){
        return new Limit(configuration.getMinimum(),configuration.getMaximum());
        //return new Limit(1,1000);
    }


}
