package com.example.demo.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventoResponse {

    private String mensaje;
    private int estadoCodigo;
    private LocalDateTime fechaHora;

}