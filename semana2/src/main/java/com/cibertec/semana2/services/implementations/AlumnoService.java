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

    @Override
    public void deleteAlumno(String codigo) {
        // 1. Algoritmo para eliminar un alumno desde el arreglo en base a su codigo - 7:05
        alumnos.removeIf(alumno -> alumno.getCodigo().equals(codigo));
    }

    @Override
    public Alumno updateAlumno(String codigo, Alumno alumnoActualizado) {
        // 2. Algoritmo para actualizar un alumno, el alumno debe existir previamente (codigo) - 7:15
        //UnaryOperator
        /* alumnos.replaceAll(alumno -> alumno.getCodigo().equals(codigo) ? alumnoActualizado : alumno); //
        return alumno;
        */
        // Forma dos
        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigo)) {
                alumno.setNombre(alumnoActualizado.getNombre());
                alumno.setApellido(alumnoActualizado.getApellido());
                alumno.setCorreo(alumnoActualizado.getCorreo());
                alumno.setFechaNacimiento(alumnoActualizado.getFechaNacimiento());
                break;
            }
        }
        return alumnoActualizado;
    }
}
