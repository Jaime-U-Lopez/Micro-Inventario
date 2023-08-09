package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.GruposDeConteo;

import java.util.List;

public interface IGrupoDeConteoPersistencePort {

    void saveGrupoDeConteo(GruposDeConteo gruposDeConteo);

    void deleteGrupoDeConteo(GruposDeConteo gruposDeConteo);

    GruposDeConteo getUsuario(Long id);


    List<GruposDeConteo> getAllGruposDeConteo();

}
