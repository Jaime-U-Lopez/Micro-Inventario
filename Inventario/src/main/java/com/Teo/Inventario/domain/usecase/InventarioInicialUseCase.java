package com.Teo.Inventario.domain.usecase;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import com.pragma.usuariomicroservice.adapters.http.exceptions.UsuarioExcepcionRolNoExiste;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.entity.RolEntity;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.mapper.RolEntityMapper;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.repository.IRolRepository;
import com.pragma.usuariomicroservice.configuration.Constants;
import com.pragma.usuariomicroservice.domain.api.IUsuarioServicePort;
import com.pragma.usuariomicroservice.domain.model.Rol;
import com.pragma.usuariomicroservice.domain.model.Usuario;
import com.pragma.usuariomicroservice.domain.spi.IUsuarioPersistencePort;
import com.pragma.usuariomicroservice.domain.usecase.validaciones.ValidacionesGenerales;
import com.pragma.usuariomicroservice.domain.usecase.validaciones.ValidacionesUsuario;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class InventarioInicialUseCase implements IUsuarioServicePort {

    private final IUsuarioPersistencePort usuarioPersistencePort;
    private final IRolRepository rolRepository;
    private final RolEntityMapper rolEntityMapper;


}
