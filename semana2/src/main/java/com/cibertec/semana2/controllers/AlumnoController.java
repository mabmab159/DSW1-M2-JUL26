package com.cibertec.semana2.controllers;

import com.cibertec.semana2.models.Alumno;
import com.cibertec.semana2.services.IAlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/alumno")
public class AlumnoController {

    private final IAlumnoService iAlumnoService;

    @GetMapping
    public String index(Model model){
        model.addAttribute("alumnos", iAlumnoService.getAllAlumnos());
        return "index";
    }

    @GetMapping("/informacion/{codigo}")
    public String informacion(@PathVariable("codigo") String codigo, Model model){
        model.addAttribute("alumno", iAlumnoService.getAlumnoByCodigo(codigo));
        return "informacion";
    }

    @GetMapping("/formulario")
    public String formulario(Model model){
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Alumno alumno){
        iAlumnoService.saveAlumno(alumno);
        return "redirect:/alumno";
    }
}
