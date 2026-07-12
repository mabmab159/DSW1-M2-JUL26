package com.cibertec.semana1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que es un controlador Api-REST
@RequestMapping("/prueba") // Indica que la ruta base es /prueba
public class PruebaControlador {

    @GetMapping
    public String holaMundo(){
        return "Hola Mundo";
    }

    @GetMapping("/hola2")
    public String holaMundo2(){
        return "Hola Mundo 2";
    }
}
