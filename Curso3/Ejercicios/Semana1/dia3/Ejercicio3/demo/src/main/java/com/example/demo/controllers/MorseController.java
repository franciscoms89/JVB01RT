package com.example.demo.controllers;

import com.example.demo.service.MorseServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
public class MorseController {

    private final MorseServiceInterface service;

    public MorseController(MorseServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/convertir")
    public ResponseEntity<String> convertirTextoAMorse(@RequestParam String texto) {
        try {
            return ResponseEntity.ok(service.palabraAMorse(texto));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
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