package com.Teo.InventarioInicial.adapters.http.dto.request;


import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlmacenRequestDto {



    @NotBlank
    private String nombre;
    @NotBlank
    private String direccion;

}
