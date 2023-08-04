package com.Teo.InventarioInicial.domain.api;

import com.Teo.InventarioInicial.domain.model.Almacen;

public interface IAlmacenServicePort {

    void saveAlmacen(Almacen almacen);

    void deleteALmacen(Almacen almacen);

    Almacen getAlmacen(Long id);


}
