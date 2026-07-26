package com.cibertec.semana3.services.implementation;

import com.cibertec.semana3.models.Alumno;
import com.cibertec.semana3.repositories.AlumnoRepository;
import com.cibertec.semana3.services.IAlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlumnoService implements IAlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Override
    public Alumno getAlumno(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}
