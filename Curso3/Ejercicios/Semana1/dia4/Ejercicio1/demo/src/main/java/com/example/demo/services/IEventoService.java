package com.example.demo.services;

import com.example.demo.dtos.EventoDTO;
import com.example.demo.models.Evento;
import com.example.demo.models.EventoResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEventoService {

    ResponseEntity<List<EventoDTO>> mostrarEventos();

    ResponseEntity<EventoDTO> buscarEvento(Long id);

    ResponseEntity<EventoResponse> crearEvento(EventoDTO evento);

    // ================ MAPEO DE DTO Y OBJ ================

    EventoDTO mappedToDTO (Evento e);

    Evento mappedToOBJT(EventoDTO e);

}