package com.pruebaTecnica.vuelos_api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VueloDTO {

    @JsonProperty("vueloId")
    private Integer id;

    @JsonProperty("vueloNombre")
    private String nombreVuelo;

    @JsonProperty("vueloEmpresa")
    private String empresa;

    @JsonProperty("vueloLugarSalida")
    private String lugarSalida;

    @JsonProperty("vueloLugarLlegada")
    private String lugarLlegada;

    @JsonProperty("vueloFechaSalida")
    private LocalDate fechaSalida;

    @JsonProperty("vueloFechaLlegada")
    private LocalDate fechaLlegada;

    @JsonProperty("vueloDuracionDias")
    private long duracionDias;

}