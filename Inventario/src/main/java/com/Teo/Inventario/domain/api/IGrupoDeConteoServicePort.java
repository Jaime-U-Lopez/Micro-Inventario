package com.Teo.Inventario.domain.api;

import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.model.InventarioInicial;

import java.util.List;

public interface IGrupoDeConteoServicePort {

    void saveGrupoDeConteo(GruposDeConteo gruposDeConteo);

    void deleteGrupoDeConteo(Long id);

    GruposDeConteo getGruposDeConteo(Long id);

    List<GruposDeConteo> getAllGruposDeConteo();

}
