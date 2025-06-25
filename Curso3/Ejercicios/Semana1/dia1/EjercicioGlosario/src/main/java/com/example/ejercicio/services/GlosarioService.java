package com.example.ejercicio.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GlosarioService {

    private final List<String> glosario = List.of(
            "1. Spring Boot – Framework que simplifica el desarrollo de aplicaciones Java basadas en Spring.",
            "2. Framework – Conjunto de herramientas y librerías que facilitan el desarrollo de software.",
            "3. Dependency Injection – Técnica de diseño para lograr una arquitectura más flexible y desacoplada.",
            "4. Spring Initializr – Herramienta web para generar esqueletos de proyectos Spring Boot.",
            "5. POM.xml – Archivo de configuración usado por Maven para gestionar dependencias y configuraciones.",
            "6. Controller – Componente que maneja las solicitudes HTTP y define las rutas de la aplicación.",
            "7. Main Class – Clase principal que contiene el método main() y la anotación @SpringBootApplication.",
            "8. Application.properties – Archivo donde se configuran propiedades personalizadas de la aplicación.",
            "9. Whitelabel Error Page – Página de error genérica de Spring Boot cuando no se encuentra un controlador.",
            "10. DevTools – Dependencia útil para facilitar el desarrollo, permitiendo recarga automática y mejoras en los logs."
    );

    public List<String> findAll() {
        return this.glosario;
    }

    public String obtenerAleatorio(){
        Random random = new Random();
        int index = random.nextInt(glosario.size());
        return glosario.get(index);
    }
}
