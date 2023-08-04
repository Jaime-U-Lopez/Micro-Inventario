package com.Teo.UsuariosInventario.domain.spi;

import com.pragma.usuariomicroservice.domain.model.Usuario;

public interface IUsuarioPersistencePort {

    void guardarUsuario(Usuario usuario);

    void deleteUsuario(Usuario usuario);

    Usuario getUsuario(Long id);

    Usuario findUsuarioEntityByCorreo(String email);
}
