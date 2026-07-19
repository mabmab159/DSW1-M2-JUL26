package com.cibertec.semana2.services;

import com.cibertec.semana2.models.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> getAllAlumnos();
    Alumno getAlumnoByCodigo(String codigo);
    Alumno saveAlumno(Alumno alumno);
    void deleteAlumno(String codigo);
    Alumno updateAlumno(String codigo, Alumno alumno); // /actualizar/1, {codigo:100}
}
