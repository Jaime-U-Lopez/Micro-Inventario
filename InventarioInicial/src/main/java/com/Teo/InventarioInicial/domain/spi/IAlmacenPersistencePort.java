package com.Teo.InventarioInicial.domain.spi;

import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;

import java.util.List;

public interface IAlmacenPersistencePort {

    void save(Almacen almacen);
    void delete(Almacen almacen);
    Almacen getAlmacen(Long id);
    List<Almacen> getAllAlmacen();

}
