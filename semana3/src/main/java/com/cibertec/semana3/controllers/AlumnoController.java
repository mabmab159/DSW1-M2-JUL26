package com.cibertec.semana3.controllers;

import com.cibertec.semana3.models.Alumno;
import com.cibertec.semana3.services.IAlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
@RequiredArgsConstructor
public class AlumnoController {
    private final IAlumnoService iAlumnoService;

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo";
    }

    @GetMapping("/hola2")
    public ResponseEntity<Alumno> holaMundo2(){
        /*return Alumno.builder()
                .nombre("Juan")
                .apellido("Perez")
                .build();
        return ResponseEntity.ok(Alumno.builder()
                .nombre("Juan")
                .apellido("Perez")
                .build());*/
        return new ResponseEntity<>(Alumno.builder()
                .nombre("Juan")
                .apellido("Perez")
                .build(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumno(@PathVariable Long id){
        return ResponseEntity.ok(iAlumnoService.getAlumno(id));
    }

    @PostMapping
    public ResponseEntity<Alumno> saveAlumno(@RequestBody Alumno alumno){
        return ResponseEntity.ok(iAlumnoService.saveAlumno(alumno));
    }
}
