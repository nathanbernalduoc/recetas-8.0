package com.grupo10.sumativa2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    //http://localhost:8080/prueba
    @GetMapping("/prueba")
    public String getPrueba() {
        System.out.println("PRUEBA");
        return "login";
    }
}
