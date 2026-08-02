package com.cibertec.semana4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(name = "marca")
@NoArgsConstructor
@AllArgsConstructor
public class MarcaEntity {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    @OneToMany // Genera una relacion de muchos a muchos - Porque requieres mapear un List
    private List<AutoEntity> autos;
}
