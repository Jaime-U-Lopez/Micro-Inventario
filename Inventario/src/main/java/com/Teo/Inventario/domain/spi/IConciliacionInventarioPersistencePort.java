package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.ConciliacionInventario;

import java.util.List;

public interface IConciliacionInventarioPersistencePort {

    void saveConciliacionInventario(ConciliacionInventario conciliacionInventario);

    void deleteConciliacionInventario(Long id);

    ConciliacionInventario getConciliacionInventario(Long id);

    List<ConciliacionInventario> getAllConciliacionInventario();

}
