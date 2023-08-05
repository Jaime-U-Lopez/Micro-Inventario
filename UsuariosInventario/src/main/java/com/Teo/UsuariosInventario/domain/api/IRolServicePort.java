package com.Teo.UsuariosInventario.domain.api;


import java.util.List;

public interface IRolServicePort {


    List<Rol> getAllRoles();

    void saveRole(Rol rol);

    void deleteRole(Rol rol);

    Rol getRole(Long id);

}
