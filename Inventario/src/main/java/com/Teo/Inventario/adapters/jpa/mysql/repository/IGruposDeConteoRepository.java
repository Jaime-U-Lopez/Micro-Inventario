package com.Teo.Inventario.adapters.jpa.mysql.repository;

import com.Teo.Inventario.adapters.jpa.mysql.entity.GruposDeConteoEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGruposDeConteoRepository extends JpaRepository<GruposDeConteoEntity, Long> {

    //Optional<UsuarioEntity> findUsuarioEntityByCorreo(String correo);
    //Optional<UsuarioEntity> findUsuarioEntityByNumeroDocumento(String numeroDocumento);


}
