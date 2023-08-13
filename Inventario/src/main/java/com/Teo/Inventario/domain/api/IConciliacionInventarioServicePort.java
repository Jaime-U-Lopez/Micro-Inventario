package com.Teo.Inventario.domain.api;

import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IConciliacionInventarioServicePort {

    void saveConciliacionInventario(ConciliacionInventario  conciliacionInventario);

    void deleteConciliacionInventario(Long id);

    ConciliacionInventario getConciliacionInventario(Long id);

    List<ConciliacionInventario> getAllConciliacionInventario();


}
