package com.example.demo.controllers;

import com.example.demo.dtos.EventoDTO;
import com.example.demo.models.EventoResponse;
import com.example.demo.services.IEventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventoController {

    private final IEventoService ies;

    public EventoController(IEventoService ies) {
        this.ies = ies;
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<EventoDTO>> mostrarEventos() {
        return ies.mostrarEventos();
    }

    @GetMapping("evento/{id}")
    public ResponseEntity<EventoDTO> buscarEvento(@PathVariable Long id) {
        return ies.buscarEvento(id);
    }

    @PostMapping("/evento")
    public ResponseEntity<EventoResponse> crearEvento(@RequestBody EventoDTO evento) {
        return ies.crearEvento(evento);
    }
}