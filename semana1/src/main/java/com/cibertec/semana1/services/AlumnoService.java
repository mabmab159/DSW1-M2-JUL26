package com.cibertec.semana1.services;

import com.cibertec.semana1.models.Alumno;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service // Indica que es un servicio
public class AlumnoService implements IAlumnoService{

    public List<String> obtenerAlumnos(){
        return List.of("Juan", "Pedro", "Maria");
    }

    @Override
    public List<Alumno> obtenerAlumnosActivos() {
        Alumno alumno1 = new Alumno("1", "Miguel", "Berrio", "pmberrio@cibertec.edu.pe", LocalDate.now(), true);
        Alumno alumno2 = new Alumno("2", "Miguel", "Berrio", "pmberrio@cibertec.edu.pe", LocalDate.now(), true);
        Alumno alumno3 = new Alumno("3", "Miguel", "Berrio", "pmberrio@cibertec.edu.pe", LocalDate.now(), true);
        Alumno alumno4 = new Alumno("4", "Miguel", "Berrio", "pmberrio@cibertec.edu.pe", LocalDate.now(), true);
        return List.of(alumno1, alumno2, alumno3, alumno4);
    }
}
