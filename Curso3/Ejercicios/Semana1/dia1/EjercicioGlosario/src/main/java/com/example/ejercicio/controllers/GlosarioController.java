package com.example.ejercicio.controllers;

import com.example.ejercicio.services.GlosarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/glosario")
public class GlosarioController {

    GlosarioService service = new GlosarioService();

    // http://localhost:8080/glosario
    @GetMapping()
    public List<String> obtenerTodoElGlosario() {
        return service.findAll();
    }

    // http://localhost:8080/glosario/aleatorio
    @GetMapping("/aleatorio")
    public String glosarioAleatorio() {
        return service.obtenerAleatorio();
    }

}
