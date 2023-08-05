package com.Teo.InventarioInicial.domain.api;

import com.Teo.InventarioInicial.domain.model.Almacen;

import java.util.List;

public interface IAlmacenServicePort {

    void saveAlmacen(Almacen almacen);

    void deleteALmacen(Almacen almacen);

    Almacen getAlmacen(Long id);

    List<Almacen> getAllAlmacen();

}
