package com.cibertec.semana1.controllers;

import com.cibertec.semana1.services.IAlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Indica que es un controlador - Vistas
@RequestMapping("/alumno")
@RequiredArgsConstructor // Indica que se necesitan los parametros del constructor
public class AlumnoController {

    //1. Por constructor explicito

    /*
    //@Autowired // No recomendado: Recupera todo el contexto de la aplicacion - TEST
    private AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
    */

    //2. Utilizando Lombok
    private final IAlumnoService iAlumnoService;

    @GetMapping
    public String holaMundo(){
        return "holaMundo";
    }

    @GetMapping("/hola2")
    public String holaMundo2(Model model){
        model.addAttribute("nombre", "Miguel Berrio");
        model.addAttribute("alumnos", iAlumnoService.obtenerAlumnos());
        return "holaMundo2";
    }

    @GetMapping("/hola3")
    public String holaMundo3(Model model){
        model.addAttribute("alumnos", iAlumnoService.obtenerAlumnosActivos());
        return "resumen/holaMundo3";
    }
}
