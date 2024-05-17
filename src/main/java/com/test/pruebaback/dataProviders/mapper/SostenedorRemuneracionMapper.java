package com.test.pruebaback.dataProviders.mapper;

import com.test.pruebaback.core.models.SostenedorRemuneracion;
import com.test.pruebaback.dataProviders.entity.SostenedorRemuneracionEntity;
import org.springframework.stereotype.Service;

@Service
public class SostenedorRemuneracionMapper {
    public SostenedorRemuneracion getSostenedorRemuneracion(SostenedorRemuneracionEntity sostenedorRemuneracionEntity) {
        return SostenedorRemuneracion.builder()
                .id(sostenedorRemuneracionEntity.getIdSostenedorRemuneracion())
                .rutSostenedor(sostenedorRemuneracionEntity.getRutSostenedor())
                .remuneracionHoraBase(sostenedorRemuneracionEntity.getRemuneracionHoraBase())
                .incremento(sostenedorRemuneracionEntity.getIncremento())
                .build();
    }
}
