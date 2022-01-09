package com.salada.salada.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class TestService {

    @Value("#{name}")
    private  String name ;
    @GetMapping("/")
    public String get(){
        return "hi " + name ;

    }

    @GetMapping("/all")
    public String getAll(){
        return "hi all" ;

    }

}
