package com.Teo.InventarioInicial.adapters.jpa.mysql.entity;



import com.Teo.InventarioInicial.domain.model.Almacen;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "articulos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombreArticulo;
    @Column(unique = true)
    private String codigoArticulo;
    private String ubicacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "almacen_id")  // Nombre de la columna en esta entidad que hace referencia a la otra entidad
    private AlmacenEntity almacen;

}
