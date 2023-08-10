package com.Teo.Inventario.adapters.jpa.mysql.entity;


import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.model.InventarioInicial;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor


@Table(name = "conciliacionInventarios")
@Data
@Entity
public class ConciliacionInventarioEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "grupos_de_conteo_id")  // Nombre de la columna en esta entidad que hace referencia a la otra entidad
    private GruposDeConteoEntity gruposDeConteo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "conteo_Inventario_id")  // Nombre de la columna en esta entidad que hace referencia a la otra entidad
    private ConteoInventarioEntity conteoInventario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inventario_Inicial_id")  // Nombre de la columna en esta entidad que hace referencia a la otra entidad
    private InventarioInicialEntity inventarioInicial;


}
