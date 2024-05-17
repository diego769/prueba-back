package com.test.pruebaback.core.useCase;

import com.test.pruebaback.controllers.dto.IngresoDTO;
import com.test.pruebaback.core.models.SostenedorRemuneracion;
import com.test.pruebaback.core.util.exception.ArgumentosInvalidosException;
import com.test.pruebaback.core.util.exception.NoEncontradoException;

public class SostenedorRemuneracionUseCase {
    private final SostenedorRemuneracionInterface sostenedorRemuneracionInterface;

    public SostenedorRemuneracionUseCase(SostenedorRemuneracionInterface sostenedorRemuneracionInterface) {
        this.sostenedorRemuneracionInterface = sostenedorRemuneracionInterface;
    }

    public SostenedorRemuneracion buscar(IngresoDTO dto) {
        if (dto.getRutSostenedor() == null) {
            throw new ArgumentosInvalidosException("Debe enviar el rut sostenedor para realizar una busqueda.");
        }

        SostenedorRemuneracion sostenedor = this.sostenedorRemuneracionInterface.buscarPorRut(dto.getRutSostenedor());
        if (sostenedor == null) {
            throw new NoEncontradoException("El sostenedor ingresado no existe. Rut sostenedor: " + dto.getRutSostenedor());
        }

        return sostenedor;
    }
}
