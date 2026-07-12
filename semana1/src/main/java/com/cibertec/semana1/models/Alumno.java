package com.cibertec.semana1.models;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor //Crea un constructor vacio
@AllArgsConstructor //Crea un constructor con todos los parametros
@Getter //Crea los getters
@Setter //Crea los setters
@ToString //Crea el metodo toString
public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaNacimiento;
    private boolean isActivo;
}
