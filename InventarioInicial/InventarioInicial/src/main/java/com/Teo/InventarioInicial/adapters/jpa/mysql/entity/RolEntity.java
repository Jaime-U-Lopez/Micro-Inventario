package com.Teo.InventarioInicial.adapters.jpa.mysql.entity;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
