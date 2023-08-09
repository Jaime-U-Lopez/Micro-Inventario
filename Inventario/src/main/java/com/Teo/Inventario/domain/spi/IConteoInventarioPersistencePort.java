package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;

import java.util.List;

public interface IConteoInventarioPersistencePort {

    void saveConteoInventario(ConteoInventario conteoInventario);

    void deleteConteoInventario(Long id);

    ConteoInventario getConteoInventario(Long id);

    List<ConteoInventario> getAllConteoInventario();

}
