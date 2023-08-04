package com.pragma.usuariomicroservice.domain.api;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import com.pragma.usuariomicroservice.domain.model.Usuario;

import java.util.Optional;

public interface IUsuarioServicePort {

    void guardarUser(Usuario usuario, RolNombre rol);

    void deleteUsuario(Usuario usuario);

    Usuario getUsuario(Long id);


   Usuario findUsuarioEntityByCorreo(String email);
}
