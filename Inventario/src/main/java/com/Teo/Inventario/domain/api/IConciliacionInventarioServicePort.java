package com.Teo.Inventario.domain.api;

import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IConciliacionInventarioServicePort {

    void saveConciliacionInventario(InventarioInicial  inventarioInicial);

    void deleteConciliacionInventario(Long id);

    InventarioInicial getConciliacionInventario(Long id);

    List<InventarioInicial> getAllConciliacionInventario();


}
