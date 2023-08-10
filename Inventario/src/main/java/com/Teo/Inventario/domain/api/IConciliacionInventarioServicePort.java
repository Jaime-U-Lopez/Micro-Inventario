package com.Teo.Inventario.domain.api;

import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IConciliacionInventarioServicePort {

    void saveInventarioInicial(InventarioInicial  inventarioInicial);

    void deleteInventarioInicial(Long id);

    InventarioInicial getInventarioInicial(Long id);

    List<InventarioInicial> getAllInventarioInicial();


}
