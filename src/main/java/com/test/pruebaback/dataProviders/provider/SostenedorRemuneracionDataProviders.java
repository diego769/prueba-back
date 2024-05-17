package com.test.pruebaback.dataProviders.provider;

import com.test.pruebaback.core.models.SostenedorRemuneracion;
import com.test.pruebaback.core.useCase.SostenedorRemuneracionInterface;
import com.test.pruebaback.core.util.exception.NoEncontradoException;
import com.test.pruebaback.dataProviders.entity.SostenedorRemuneracionEntity;
import com.test.pruebaback.dataProviders.mapper.SostenedorRemuneracionMapper;
import com.test.pruebaback.dataProviders.repository.SostenedorRemuneracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SostenedorRemuneracionDataProviders")
public class SostenedorRemuneracionDataProviders implements SostenedorRemuneracionInterface {
    @Autowired
    SostenedorRemuneracionRepository sostenedorRemuneracionRepository;
    @Autowired
    SostenedorRemuneracionMapper sostenedorRemuneracionMapper;
    @Override
    public SostenedorRemuneracion buscarPorRut(String rut) {
        SostenedorRemuneracionEntity sostenedorRemuneracionEntity = sostenedorRemuneracionRepository.findByRutSostenedor(rut);
        if (sostenedorRemuneracionEntity == null) {
            throw new NoEncontradoException("Sostenedor dado no existe. Rut Sostenedor: "+ rut);
        }

        return sostenedorRemuneracionMapper.getSostenedorRemuneracion(sostenedorRemuneracionEntity);
    }
}
