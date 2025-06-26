package com.pruebaTecnica.vuelos_api.controllers;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.services.VueloServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private final VueloServiceInterface serviceInterface;

    public VueloController(VueloServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    // http:localhost:8080/vuelos
    @GetMapping()
    public ResponseEntity<List<VueloDTO>> obtenerTodosLosVuelos(){
        return serviceInterface.obtenerTodosLosVuelos();
    }

    // http:localhost:8080/vuelos/id    en id poner el id que quieres buscar
    @GetMapping("{id}")
    public ResponseEntity<VueloDTO> buscarVuelo(@PathVariable Integer id){
        return serviceInterface.buscarVuelo(id);
    }

}