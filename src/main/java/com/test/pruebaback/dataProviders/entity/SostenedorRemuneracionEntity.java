package com.test.pruebaback.dataProviders.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tb_sostenedor_remuneracion")
public class SostenedorRemuneracionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_sostenedor_remuneracion")
    private Integer idSostenedorRemuneracion;

    @Column(name = "rut_sostenedor")
    private String rutSostenedor;

    @Column(name = "remuneracion_hora_base")
    private Integer remuneracionHoraBase;

    @Column(name = "incremento", precision = 10, scale = 2)
    private BigDecimal incremento;
}
