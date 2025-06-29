package com.pruebaTecnica.vuelos_api.services;

import com.pruebaTecnica.vuelos_api.dtos.VueloDTO;
import com.pruebaTecnica.vuelos_api.models.Vuelo;
import com.pruebaTecnica.vuelos_api.models.VueloResponse;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface VueloServiceInterface{

    ResponseEntity<VueloDTO> buscarVuelo(Integer id); // GET

    ResponseEntity<List<VueloDTO>> filtrarVuelos(String empresa, String lugarLlegada, LocalDate fechaSalida, String ordenarPor);

    ResponseEntity<VueloResponse> crearVuelo(VueloDTO vueloDTO); // POST

    ResponseEntity<VueloResponse> actualizarVuelo(Integer id, VueloDTO vueloAActualizar); // PUT

    ResponseEntity<VueloResponse> modificarVuelo(Integer id, VueloDTO vueloAModificar); // PATCH

    ResponseEntity<VueloResponse> eliminarVuelo(Integer id); // DELETE

    // Mapeo de DTOs
    VueloDTO mappedToDTO(Vuelo v);

    // Mapeo de OBJETO
    Vuelo mappedToObj(VueloDTO v);

}