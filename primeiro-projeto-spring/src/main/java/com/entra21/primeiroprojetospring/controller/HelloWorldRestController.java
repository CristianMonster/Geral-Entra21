package com.entra21.primeiroprojetospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController { //controlador da minha api rest responsavel pelo hello world - trabalhar forte com a nomeação

    @GetMapping("/") //nesse caso o endpoing é a /
    public String helloWorld(){
        return "Hello World";
    }


    @PostMapping("/")
    public String greet(@RequestBody String user){
        return "Welcome " +user ;
    }
}
