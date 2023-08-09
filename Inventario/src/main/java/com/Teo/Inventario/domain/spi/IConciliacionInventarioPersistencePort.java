package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.ConteoInventario;

import java.util.List;

public interface IConciliacionInventarioPersistencePort {

    void saveConciliacionInventario(ConciliacionInventario conciliacionInventario);

    void deleteConciliacionInventario(Long id);

    ConciliacionInventario getUsuario(Long id);

    List<ConciliacionInventario> getAllConciliacionInventario();

}
