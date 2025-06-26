package com.pruebaTecnica.vuelos_api.services;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.Vuelo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VueloServiceInterface{

    ResponseEntity<List<VueloDTO>> obtenerTodosLosVuelos(); // GET

    ResponseEntity<VueloDTO> buscarVuelo(int id); // GET

    ResponseEntity<VueloDTO> crearVuelo(VueloDTO vueloDTO); // POST

    ResponseEntity<VueloDTO> actualizarVuelo(int id, VueloDTO vueloAActualizar); // PUT

    ResponseEntity<VueloDTO> modificarVuelo(int id, VueloDTO vueloAModificar); // PATCH

    ResponseEntity<Void> eliminarVuelo(int id); // DELETE

    // Mapeo de DTOs
    VueloDTO mappedToDTO(Vuelo v);

    // Mapeo de OBJETO
    Vuelo mappedToObj(VueloDTO v);
}