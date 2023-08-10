package com.Teo.Inventario.adapters.jpa.mysql.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor

@Entity
@Table(name = "gruposDeConteos")
@Data
public class GruposDeConteoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String grupo;


}
