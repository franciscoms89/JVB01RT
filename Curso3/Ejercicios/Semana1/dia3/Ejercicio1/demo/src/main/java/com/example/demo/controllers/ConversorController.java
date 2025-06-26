package com.example.demo.controllers;

import com.example.demo.services.ConversorServiceInterface;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    private final ConversorServiceInterface service;

    public ConversorController(ConversorServiceInterface service) {
        this.service = service;
    }

    @GetMapping("{cm}")
    public String convertirAMetros(@PathVariable Double cm){
        try {
            return service.centimetrosAMetros(cm);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }
}
