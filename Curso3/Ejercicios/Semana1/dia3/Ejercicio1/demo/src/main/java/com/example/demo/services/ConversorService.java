package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ConversorService implements ConversorServiceInterface {

    @Override
    public String centimetrosAMetros(Double cm) {
        if(cm == null || cm < 0){
            throw new IllegalArgumentException("Ingrese un valor superior a 0");
        }
        double metros = cm/100.0;
        return "El equivalente a " + cm + " cm es de " + metros + " metros.";
    }
}
