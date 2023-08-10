package com.Teo.Inventario.adapters.jpa.mysql.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@Entity
@Table(name = "conteoInventarios")
@Data
public class ConteoInventarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;



}
