package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IInventarioInicialPersistencePort {

    void saveInventarioInicial(InventarioInicial inventarioInicial);

    void deleteInventarioInicial(InventarioInicial inventarioInicial);

    InventarioInicial getInventarioInicial(Long id);


    List<InventarioInicial>  getAllInventarioInicial();


}
