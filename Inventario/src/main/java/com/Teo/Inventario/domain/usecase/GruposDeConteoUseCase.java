package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IGrupoDeConteoServicePort;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.spi.IGrupoDeConteoPersistencePort;

import java.util.List;

public class GruposDeConteoUseCase implements IGrupoDeConteoServicePort {


    private final IGrupoDeConteoPersistencePort grupoDeConteoPersistencePort;

    public GruposDeConteoUseCase(IGrupoDeConteoPersistencePort grupoDeConteoPersistencePort) {
        this.grupoDeConteoPersistencePort = grupoDeConteoPersistencePort;
    }

    @Override
    public void saveGrupoDeConteo(GruposDeConteo gruposDeConteo) {
    grupoDeConteoPersistencePort.saveGrupoDeConteo(gruposDeConteo);
    }

    @Override
    public void deleteGrupoDeConteo(Long id) {

    grupoDeConteoPersistencePort.deleteGrupoDeConteo(id);
    }

    @Override
    public GruposDeConteo getGruposDeConteo(Long id) {
        return grupoDeConteoPersistencePort.getGrupoDeConteo(id);
    }

    @Override
    public List<GruposDeConteo> getAllGruposDeConteo() {
        return grupoDeConteoPersistencePort.getAllGruposDeConteo();
    }
}
