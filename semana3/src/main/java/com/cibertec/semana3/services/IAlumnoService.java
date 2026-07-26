package com.cibertec.semana3.services;

import com.cibertec.semana3.models.Alumno;

public interface IAlumnoService {
    Alumno getAlumno(Long id);
    Alumno saveAlumno(Alumno alumno);
}
