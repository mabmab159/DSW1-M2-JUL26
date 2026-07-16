package com.cibertec.semana2.services.implementations;

import com.cibertec.semana2.models.Alumno;
import com.cibertec.semana2.services.IAlumnoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService implements IAlumnoService {
    List<Alumno> alumnos = new ArrayList<>();

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnos;
    }

    @Override
    public Alumno getAlumnoByCodigo(String codigo) {
        for (Alumno alu : alumnos) {
        // equals() sirve para comparar si los textos son idénticos
            if (alu.getCodigo().equals(codigo)) {
                return alu;
            }
        }
        return null;
        /* return alumnos.stream()
                .filter(alu -> alu.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
         */
    }

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        alumnos.add(alumno);
        return alumno;
    }
}
