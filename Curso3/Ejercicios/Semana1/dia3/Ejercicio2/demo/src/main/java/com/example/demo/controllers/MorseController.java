package com.example.demo.controllers;

import com.example.demo.service.MorseServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    private final MorseServiceInterface service;

    public MorseController(MorseServiceInterface service) {
        this.service = service;
    }

    @GetMapping("{palabra}")
    public String convertirPalabraAMorse(@PathVariable String palabra){
        try {
            return service.palabraAMorse(palabra);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }
}
