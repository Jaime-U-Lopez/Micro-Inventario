package com.Teo.UsuariosInventario.domain.spi;

import com.pragma.usuariomicroservice.domain.model.Rol;

import java.util.List;

public interface IRolPersistencePort {

    List<Rol> getAllRoles();

    void save(Rol rol);

    void deleteRol(Rol rol);

    Rol getRole(Long id);


}
