package com.Teo.Inventario.domain.spi;

import com.Teo.Inventario.domain.model.GruposDeConteo;

import java.util.List;

public interface IGrupoDeConteoPersistencePort {

    void saveGrupoDeConteo(GruposDeConteo gruposDeConteo);

    void deleteGrupoDeConteo(Long id );

    GruposDeConteo getGrupoDeConteo(Long id);


    List<GruposDeConteo> getAllGruposDeConteo();

}
