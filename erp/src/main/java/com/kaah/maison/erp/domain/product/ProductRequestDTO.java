package com.kaah.maison.erp.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(
        @NotBlank
        String name,

        Double cost,

        Integer expense,

        Integer margin,

        @NotNull
        Double price
) {
}
