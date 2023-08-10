package com.Teo.Inventario.adapters.jpa.mysql.entity;


import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.model.InventarioInicial;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@NoArgsConstructor
@Data
public class ConciliacionInventarioEntity {


    @Id
    private Long id;
    private GruposDeConteo gruposDeConteo;
    private ConteoInventario conteoInventario;
    private InventarioInicial inventarioInicial;


}
