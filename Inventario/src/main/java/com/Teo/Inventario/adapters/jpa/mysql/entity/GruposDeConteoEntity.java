package com.Teo.Inventario.adapters.jpa.mysql.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@NoArgsConstructor
@Data
public class GruposDeConteoEntity {

    @Id
    private long id;
    private String grupo;


}
