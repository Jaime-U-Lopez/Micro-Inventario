package com.Teo.Inventario.adapters.jpa.mysql.repository;

import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IInventarioInicialRepository extends JpaRepository<InventarioInicialEntity, Long> {

    //Optional<UsuarioEntity> findUsuarioEntityByCorreo(String correo);
    //Optional<UsuarioEntity> findUsuarioEntityByNumeroDocumento(String numeroDocumento);


}
