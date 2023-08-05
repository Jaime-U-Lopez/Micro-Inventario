package com.Teo.InventarioInicial.adapters.jpa.mysql.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Almacenes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlmacenEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;


}
