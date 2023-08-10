package com.Teo.Inventario.adapters.jpa.mysql.repository;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConciliacionInventarioEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConciliacionInventarioRepository extends JpaRepository<ConciliacionInventarioEntity, Long> {

    //Optional<UsuarioEntity> findUsuarioEntityByCorreo(String correo);
    //Optional<UsuarioEntity> findUsuarioEntityByNumeroDocumento(String numeroDocumento);


}
