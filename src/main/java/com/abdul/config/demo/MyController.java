package com.abdul.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${my.greeting}")
    String myMessage;

    @GetMapping("/greeting")
    public  String greeting(){
        return  myMessage;
    }


}
