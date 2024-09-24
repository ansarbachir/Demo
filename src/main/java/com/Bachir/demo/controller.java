/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Bachir.demo;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api/v2/")
public class controller {
    
    
    @GetMapping
    public String getTime(){
        return new Date().toString();
    }
    
    @PostMapping
    public String sayHello(@PathVariable String name){
        return "Hello "+name;
    }
}
