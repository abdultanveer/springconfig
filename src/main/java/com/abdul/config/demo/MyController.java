package com.abdul.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    @Value("${my.greeting:default-value}")
    String myMessage;

    @Value("${my.list.values}")
    List<String> values;

    @Value("#{${db.values}}")
    Map<String,String> dbValues;

    @GetMapping("/greeting")
    public  String greeting(){
        return  myMessage+values+dbValues;
    }


}
