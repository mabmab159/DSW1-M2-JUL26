package com.cibertec.semana2.services;

import com.cibertec.semana2.models.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> getAllAlumnos();
    Alumno getAlumnoByCodigo(String codigo);
    Alumno saveAlumno(Alumno alumno);
}
