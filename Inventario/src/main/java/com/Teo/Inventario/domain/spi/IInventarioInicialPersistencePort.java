package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IInventarioInicialPersistencePort {

    void saveInventarioInicial(InventarioInicial inventarioInicial);

    void deleteInventarioInicial(Long id);

    InventarioInicial getInventarioInicial(Long id);


    List<InventarioInicial>  getAllInventarioInicial();


}
