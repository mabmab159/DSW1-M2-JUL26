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
        model.addAttribute("ruta", "/alumno/guardar");
        //return "formulario";
        return "formulario2";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Alumno alumno){
        iAlumnoService.saveAlumno(alumno);
        return "redirect:/alumno";
    }

    // Actualizar
    @GetMapping("/formulario/{codigo}") //Formulario con los datos previos
    public String formulario(@PathVariable("codigo") String codigo, Model model)
    {
        model.addAttribute("alumno", iAlumnoService.getAlumnoByCodigo(codigo));
        model.addAttribute("ruta", "/alumno/actualizar/"+codigo);
        //return "formularioActualizar";
        return "formulario2";
    }

    @PostMapping("/actualizar/{codigo}") //Se va a activar en el boton actualizar o guardar
    public String actualizar(@PathVariable("codigo") String codigo, @ModelAttribute Alumno alumno){
        iAlumnoService.updateAlumno(codigo, alumno);
        return "redirect:/alumno";
    }

    // Eliminar
    @PostMapping("/eliminar/{codigo}")
    public String eliminar(@PathVariable("codigo") String codigo){
        iAlumnoService.deleteAlumno(codigo);
        return "redirect:/alumno";
    }
}
