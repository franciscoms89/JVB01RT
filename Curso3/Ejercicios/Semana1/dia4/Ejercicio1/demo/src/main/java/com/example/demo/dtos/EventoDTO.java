package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO {

    @JsonIgnore
    private Long id;

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("descripcion")
    private String descripcion;

    @JsonProperty("fecha")
    private LocalDate fecha;

    @JsonProperty("hora")
    private LocalTime hora;

    @JsonProperty("lugar")
    private String lugar;

    @JsonProperty("ponente")
    private String ponente;
}