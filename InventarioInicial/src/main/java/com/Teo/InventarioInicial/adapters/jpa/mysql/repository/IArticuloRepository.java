package com.Teo.InventarioInicial.adapters.jpa.mysql.repository;


import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloRepository extends JpaRepository<ArticuloEntity, Long> {
}
