package com.pruebaTecnica.vuelos_api.controllers;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.VueloResponse;
import com.pruebaTecnica.vuelos_api.services.VueloServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private final VueloServiceInterface serviceInterface;

    public VueloController(VueloServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    // http://localhost:8080/vuelos/        - GET
    @GetMapping()
    public ResponseEntity<List<VueloDTO>> filtrarVuelos(@RequestParam(required = false) String empresa,
                                                        @RequestParam(required = false) String lugarLlegada,
                                                        @RequestParam(required = false) LocalDate fechaSalida,
                                                        @RequestParam(required = false) String ordenarPor) {
        return serviceInterface.filtrarVuelos(empresa, lugarLlegada, fechaSalida, ordenarPor);
    }

    // http://localhost:8080/vuelos/id      - GET
    @GetMapping("/{id}")
    public ResponseEntity<VueloDTO> buscarVuelo(@PathVariable Integer id) {
        return serviceInterface.buscarVuelo(id);
    }

    // http://localhost:8080/vuelos         -POST
    @PostMapping()
    public ResponseEntity<VueloResponse> crearVuelo(@RequestBody VueloDTO vueloDTO) {
        return serviceInterface.crearVuelo(vueloDTO);
    }

    // http://localhost:8080/vuelos/id      - PUT
    @PutMapping("/{id}")
    public ResponseEntity<VueloResponse> actualizarVuelo(@PathVariable Integer id,
                                                    @RequestBody VueloDTO vueloAActualizar) {
        return serviceInterface.actualizarVuelo(id, vueloAActualizar);
    }

    // http://localhost:8080/vuelos/id      - PATCH
    @PatchMapping("/{id}")
    public ResponseEntity<VueloResponse> modificarVuelo(@PathVariable Integer id,
                                                   @RequestBody VueloDTO vueloAModificar) {
        return serviceInterface.modificarVuelo(id, vueloAModificar);
    }

    // http://localhost:8080/vuelos/id      - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<VueloResponse> eliminarVuelo(@PathVariable Integer id) {
        return serviceInterface.eliminarVuelo(id);
    }
}