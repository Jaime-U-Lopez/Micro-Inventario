package com.Teo.Inventario.adapters.jpa.mysql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "inventarioInicial")
@Data
public class InventarioInicialEntity {

    @Id
    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;
    private String Nombrealmacen;

}
