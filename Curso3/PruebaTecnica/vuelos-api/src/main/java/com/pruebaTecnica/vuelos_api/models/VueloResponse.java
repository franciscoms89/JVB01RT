package com.pruebaTecnica.vuelos_api.models;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VueloResponse {

    private String mensaje;
    private int estadoCodigo;
    private LocalDateTime fechaHora;

}