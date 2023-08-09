package com.Teo.InventarioInicial.domain.api;

import com.Teo.InventarioInicial.domain.model.Almacen;

import java.util.List;

public interface IAlmacenServicePort {

    void saveAlmacen(Almacen almacen);

    void deleteALmacen(Long id);

    Almacen getAlmacen(Long id);

    List<Almacen> getAllAlmacen();

}
