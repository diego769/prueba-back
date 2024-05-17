package com.test.pruebaback.core.models;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class SostenedorRemuneracion {
    private Integer id;
    private String rutSostenedor;
    private Integer remuneracionHoraBase;
    private BigDecimal incremento;
}
