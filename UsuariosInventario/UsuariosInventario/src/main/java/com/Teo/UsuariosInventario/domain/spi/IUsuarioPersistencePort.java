package com.pragma.usuariomicroservice.domain.spi;

import com.pragma.usuariomicroservice.adapters.jpa.mysql.entity.UsuarioEntity;
import com.pragma.usuariomicroservice.domain.model.Usuario;

import java.util.Optional;

public interface IUsuarioPersistencePort {

    void guardarUsuario(Usuario usuario);

    void deleteUsuario(Usuario usuario);

    Usuario getUsuario(Long id);

    Usuario findUsuarioEntityByCorreo(String email);
}
