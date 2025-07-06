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

    @PutMapping("/evento/{id}")
    public ResponseEntity<EventoResponse> actualizarEvento(@PathVariable Long id,
                                                           @RequestBody EventoDTO evento) {
        return ies.actualizarEvento(id, evento);
    }

    @PatchMapping("/evento/{id}")
    public ResponseEntity<EventoResponse> modificarEvento(@PathVariable Long id,
                                                          @RequestBody EventoDTO evento){
        return ies.modificarEvento(id, evento);
    }

    @DeleteMapping("/evento/{id}")
    public ResponseEntity<EventoResponse> eliminarEvento(@PathVariable Long id){
        return ies.eliminarEvento(id);
    }
}