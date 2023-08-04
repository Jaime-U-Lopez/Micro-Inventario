package com.pragma.usuariomicroservice.adapters.jpa.mysql.entity;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String descripcion;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre nombreRol;




}
