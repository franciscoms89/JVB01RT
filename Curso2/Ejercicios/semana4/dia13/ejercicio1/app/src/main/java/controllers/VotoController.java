package controllers;

import entities.Voto;
import persistence.GenericJPA;

import java.util.List;

public class VotoController {
    private final GenericJPA<Voto, Long> votoJPA;

    public VotoController() {
        this.votoJPA = new GenericJPA<>(Voto.class);
    }

    public void create(String partido){
        Voto newVoto = new Voto();
        newVoto.setPartido(partido);
        votoJPA.create(newVoto);
    }

    public List<Voto> findAll(){
        return votoJPA.findAll();
    }
}
