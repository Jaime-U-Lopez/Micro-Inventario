package com.Teo.Inventario.adapters.jpa.mysql.repository;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConteoInventarioEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConteoInventarioRepository extends JpaRepository<ConteoInventarioEntity, Long> {

    //Optional<UsuarioEntity> findUsuarioEntityByCorreo(String correo);
    //Optional<UsuarioEntity> findUsuarioEntityByNumeroDocumento(String numeroDocumento);


}
