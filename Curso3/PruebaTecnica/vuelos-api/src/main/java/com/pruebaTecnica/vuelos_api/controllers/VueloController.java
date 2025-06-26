package com.pruebaTecnica.vuelos_api.controllers;

import com.pruebaTecnica.vuelos_api.services.VueloServiceInterface;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private final VueloServiceInterface serviceInterface;

    public VueloController(VueloServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }


}