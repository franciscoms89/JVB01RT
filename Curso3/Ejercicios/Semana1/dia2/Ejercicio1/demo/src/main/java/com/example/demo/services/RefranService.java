package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RefranService implements RefranServiceInterface{

    private final List<String> refranes =List.of(
            "A caballo regalado no se le mira el diente",
            "Más vale pájaro en mano que ciento volando",
            "El que espera, desespera",
            "Cuando el río suena, agua lleva",
            "Ojos que no ven, corazón que no siente",
            "Cría fama y échate a dormir",
            "No hay mal que por bien no venga",
            "Al que buen árbol se arrima, buena sombra lo cobija",
            "Del dicho al hecho hay mucho trecho",
            "Quien mucho corre, pronto para"
    );

    @Override
    public List<String> findAll() {
        return this.refranes;
    }

    @Override
    public String showRandom() {
        Random random = new Random();
        int index = random.nextInt(refranes.size());
        return refranes.get(index);
    }
}
