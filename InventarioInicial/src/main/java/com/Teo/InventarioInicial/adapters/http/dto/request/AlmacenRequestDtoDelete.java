package com.Teo.InventarioInicial.adapters.http.dto.request;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlmacenRequestDtoDelete {

    @NotBlank
    @Id
    private Long id;

}
