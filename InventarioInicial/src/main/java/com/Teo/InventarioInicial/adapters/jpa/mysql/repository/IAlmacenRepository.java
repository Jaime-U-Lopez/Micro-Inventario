package com.Teo.InventarioInicial.adapters.jpa.mysql.repository;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAlmacenRepository extends JpaRepository<AlmacenEntity, Long> {

        Optional<AlmacenEntity> findAlmacenByid(String id);




}
