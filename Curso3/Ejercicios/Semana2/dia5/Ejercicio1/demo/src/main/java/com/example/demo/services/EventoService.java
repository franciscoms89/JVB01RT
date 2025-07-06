package com.example.demo.services;

import com.example.demo.dtos.EventoDTO;
import com.example.demo.models.Evento;
import com.example.demo.models.EventoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService implements IEventoService {

    private final List<Evento> listado = new ArrayList<>();

    public EventoService() {
        listado.add(new Evento(1L, "Jornadas de Matemática Aplicada",
                "Charlas sobre teoría de números, estadística y modelado matemático.",
                LocalDate.of(2025, 8, 10), LocalTime.of(9, 0),
                "Aula 101, Facultad de Ciencias Exactas", "Dra. Mariana López"));

        listado.add(new Evento(2L, "Foro de Ética en la Inteligencia Artificial",
                "Discusión interdisciplinaria sobre implicancias éticas de la IA.",
                LocalDate.of(2025, 8, 12), LocalTime.of(11, 0),
                "Salón de Conferencias A", "Dr. Tomás Herrera"));

        listado.add(new Evento(3L, "Taller de Escritura Científica",
                "Cómo redactar y publicar artículos científicos con impacto.",
                LocalDate.of(2025, 8, 15), LocalTime.of(14, 0),
                "Biblioteca Central, Aula 3", "Mg. Laura Martínez"));

        listado.add(new Evento(4L, "Simposio de Bioinformática",
                "Exposición de investigaciones en genómica y procesamiento de datos biológicos.",
                LocalDate.of(2025, 8, 20), LocalTime.of(10, 30),
                "Laboratorio 5, Edificio de Tecnología", "Dr. Andrés Vega"));

        listado.add(new Evento(5L, "Congreso de Educación Superior y Nuevas Tecnologías",
                "Paneles sobre innovación pedagógica y aprendizaje en línea.",
                LocalDate.of(2025, 8, 22), LocalTime.of(9, 30),
                "Auditorio Principal", "Dra. Paula Romero"));

        listado.add(new Evento(6L, "Encuentro Nacional de Física Cuántica",
                "Conferencias sobre física teórica, computación cuántica y experimentos recientes.",
                LocalDate.of(2025, 8, 25), LocalTime.of(13, 0),
                "Centro de Investigación Física", "Dr. Ernesto Díaz"));

        listado.add(new Evento(7L, "Seminario de Derecho y Nuevas Tecnologías",
                "Aspectos legales del uso de blockchain, criptomonedas y datos personales.",
                LocalDate.of(2025, 8, 27), LocalTime.of(16, 0),
                "Facultad de Derecho, Aula Magna", "Dra. Silvia Fernández"));

        listado.add(new Evento(8L, "Workshop de Robótica Educativa",
                "Taller práctico sobre robótica aplicada a la enseñanza escolar.",
                LocalDate.of(2025, 8, 29), LocalTime.of(10, 0),
                "Laboratorio de Ingeniería", "Ing. Matías Sánchez"));

        listado.add(new Evento(9L, "Mesa Redonda sobre Cambio Climático",
                "Expertos debaten sobre políticas ambientales y sostenibilidad.",
                LocalDate.of(2025, 9, 2), LocalTime.of(12, 0),
                "Sala de Conferencias 2", "Dra. Alejandra Torres"));

        listado.add(new Evento(10L, "Charla: Introducción a la Astronomía",
                "Actividad para estudiantes sobre el sistema solar y el universo observable.",
                LocalDate.of(2025, 9, 5), LocalTime.of(18, 0),
                "Planetario Universitario", "Dr. Julián Rivas"));
    }

    @Override
    public ResponseEntity<List<EventoDTO>> mostrarEventos() {
        List<EventoDTO> lista = this.listado.stream().map(this::mappedToDTO).toList();
        return ResponseEntity.ok(lista);
    }

    @Override
    public ResponseEntity<EventoDTO> buscarEvento(Long id) {
        Evento eventoBuscado = this.listado.stream().filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (eventoBuscado == null) {
            return ResponseEntity.notFound().build();
        }
        EventoDTO eventoDTO = mappedToDTO(eventoBuscado);
        return ResponseEntity.ok(eventoDTO);
    }

    @Override
    public ResponseEntity<EventoResponse> crearEvento(EventoDTO evento) {
        evento.setId(this.listado.size() + 1L);
        Evento evento1 = this.mappedToOBJT(evento);
        this.listado.add(evento1);
        return ResponseEntity.status(HttpStatus.CREATED).body(new EventoResponse(
                "Evento creado correctamente",
                201,
                LocalDateTime.now()));
    }

    @Override
    public ResponseEntity<EventoResponse> actualizarEvento(Long id, EventoDTO evento) {
        Evento eventoExistente = this.listado.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (eventoExistente == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EventoResponse(
                "Evento no encontrado",
                404,
                LocalDateTime.now()));

        // Actualizamos los valores del evento que hemos buscado con el stream con los que se pasan por parámetro
        eventoExistente.setTitulo(evento.getTitulo());
        eventoExistente.setDescripcion(evento.getDescripcion());
        eventoExistente.setFecha(evento.getFecha());
        eventoExistente.setHora(evento.getHora());
        eventoExistente.setLugar(evento.getLugar());
        eventoExistente.setPonente(evento.getPonente());

        return ResponseEntity.ok(new EventoResponse(
                "Evento actualizado correctamente",
                200,
                LocalDateTime.now()));
    }

    @Override
    public ResponseEntity<EventoResponse> modificarEvento(Long id, EventoDTO evento) {
        Evento eventoExistente = this.listado.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (eventoExistente == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EventoResponse(
                "Evento no encontrado",
                404,
                LocalDateTime.now()));

        // Con los if sólo modificamos aquellos campos que son no nulos
        if (evento.getTitulo() != null) eventoExistente.setTitulo(evento.getTitulo());
        if (evento.getDescripcion() != null) eventoExistente.setDescripcion(evento.getDescripcion());
        if (evento.getFecha() != null) eventoExistente.setFecha(evento.getFecha());
        if (evento.getHora() != null) eventoExistente.setHora(evento.getHora());
        if (evento.getLugar() != null) eventoExistente.setLugar(evento.getLugar());
        if (evento.getPonente() != null) eventoExistente.setPonente(evento.getPonente());
        return ResponseEntity.ok(new EventoResponse(
                "Evento modificado parcialmente",
                200,
                LocalDateTime.now()));
    }

    @Override
    public ResponseEntity<EventoResponse> eliminarEvento(Long id) {
        boolean eventoEliminado = this.listado.removeIf(e -> e.getId().equals(id));
        if (eventoEliminado) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new EventoResponse(
                    "Evento eliminado correctamente",
                    202,
                    LocalDateTime.now()));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EventoResponse(
                    "Evento no encontrado",
                    404,
                    LocalDateTime.now()));
        }
    }

    // ================ MAPEO DE DTO Y OBJ ================

    @Override
    public EventoDTO mappedToDTO(Evento e) {
        return new EventoDTO(
                e.getId(),
                e.getTitulo(),
                e.getDescripcion(),
                e.getFecha(),
                e.getHora(),
                e.getLugar(),
                e.getPonente());
    }

    @Override
    public Evento mappedToOBJT(EventoDTO e) {
        return new Evento(
                e.getId(),
                e.getTitulo(),
                e.getDescripcion(),
                e.getFecha(),
                e.getHora(),
                e.getLugar(),
                e.getPonente());
    }
}