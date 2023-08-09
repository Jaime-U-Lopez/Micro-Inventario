package com.Teo.InventarioInicial.adapters.jpa.mysql.repository;


import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IArticuloRepository extends JpaRepository<ArticuloEntity, Long> {


}
