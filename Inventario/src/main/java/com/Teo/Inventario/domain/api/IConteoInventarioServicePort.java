package com.Teo.Inventario.domain.api;

import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;

import java.util.List;

public interface IConteoInventarioServicePort {

    void saveConteoInventario(ConteoInventario conteoInventario);

    void deleteConteoInventario(ConteoInventario conteoInventario);

    ConteoInventario getConteoInventario(Long id);


    List<GruposDeConteo> getAllConteoInventario();
}
