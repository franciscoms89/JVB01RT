package com.example.demo.controllers;

import com.example.demo.services.DatosCuriososService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curiosidades")
public class DatosCuriososController {

    DatosCuriososService service = new DatosCuriososService();

    // http://localhost:8080/curiosidades
    @GetMapping()
    public List<String> obtenerTodos() {
        return service.findAll();
    }

    // http://localhost:8080/curiosidades/aleatorio
    @GetMapping("/aleatorio")
    public String datoAleatorio(){
        return service.showRandom();
    }
}
