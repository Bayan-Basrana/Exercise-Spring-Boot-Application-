package com.example.exercisespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class welcomeController {


    @GetMapping("/name")
    public String name (){
        return "My name is Bayan";
    }
    @GetMapping("/age")
    public String age (){
        return "My age is 34";
    }


    @GetMapping("/check/status")
    public String checkStatus (){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health (){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public String[] names (){
        return new String[] {"Bayan","Ahmed","Samer","Sary"};
    }

}