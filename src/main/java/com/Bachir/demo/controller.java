/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Bachir.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        LocalDateTime currentDateTime =   LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "Current Date and Time: " +currentDateTime.format(formatter);
    }
    @GetMapping("{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+name +" BASSSSSSSSSSSSSSSSSSSSSET";
    }
}
