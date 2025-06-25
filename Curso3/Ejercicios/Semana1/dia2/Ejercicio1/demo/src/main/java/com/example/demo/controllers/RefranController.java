package com.example.demo.controllers;

import com.example.demo.services.RefranService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/refranes")
public class RefranController {

    RefranService service = new RefranService();

    // http://localhost:8080/refranes
    @GetMapping()
    public List<String> encontrarTodos() {
        return service.findAll();
    }

    // http:localhost:8080/refranes/aleatorio
    @GetMapping("/aleatorio")
    public String mostrarAleatorio() {
        return service.showRandom();
    }
}
