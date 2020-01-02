package com.bimlendu.xyz.stockmanagement.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String getHealth(){
       return "Server is up";
    }
}
