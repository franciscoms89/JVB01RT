package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DatosCuriososService implements DatosCuriososServiceInterface{

    private final List<String> datosCuriosos =List.of(
            "Los flamencos no nacen rosados, su color proviene de los carotenoides en su dieta",
            "El corazón de una ballena azul puede pesar más de 180 kilogramos",
            "Las abejas pueden reconocer rostros humanos",
            "Los pulpos tienen tres corazones y sangre azul",
            "El sol representa el 99.86% de la masa del sistema solar",
            "Los tiburones existen desde antes que los árboles",
            "Un día en Venus es más largo que su año",
            "Los caracoles pueden dormir hasta tres años seguidos",
            "Los plátanos son radiactivos debido al potasio-40",
            "Los ojos de los avestruces son más grandes que su cerebro"
    );

    @Override
    public List<String> findAll() {
        return this.datosCuriosos;
    }

    @Override
    public String showRandom() {
        Random random = new Random();
        return datosCuriosos.get(random.nextInt(datosCuriosos.size()));
    }
}
