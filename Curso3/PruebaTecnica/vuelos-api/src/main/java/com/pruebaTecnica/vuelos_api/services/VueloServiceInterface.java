package com.pruebaTecnica.vuelos_api.services;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.Vuelo;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface VueloServiceInterface{

    ResponseEntity<List<VueloDTO>> obtenerTodosLosVuelos(); // GET

    ResponseEntity<VueloDTO> buscarVuelo(Integer id); // GET

    ResponseEntity<List<VueloDTO>> filtrarVuelos(String empresa, String lugarLlegada, LocalDate fechaSalida);

    ResponseEntity<VueloDTO> crearVuelo(VueloDTO vueloDTO); // POST

    ResponseEntity<VueloDTO> actualizarVuelo(Integer id, VueloDTO vueloAActualizar); // PUT

    ResponseEntity<VueloDTO> modificarVuelo(Integer id, VueloDTO vueloAModificar); // PATCH

    ResponseEntity<Void> eliminarVuelo(Integer id); // DELETE

    // Mapeo de DTOs
    VueloDTO mappedToDTO(Vuelo v);

    // Mapeo de OBJETO
    Vuelo mappedToObj(VueloDTO v);

}