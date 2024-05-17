package com.test.pruebaback.controllers;

import com.test.pruebaback.controllers.dto.IngresoDTO;
import com.test.pruebaback.core.models.SostenedorRemuneracion;
import com.test.pruebaback.core.useCase.SostenedorRemuneracionUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    SostenedorRemuneracionUseCase sostenedorRemuneracionUseCase;

    @PostMapping("/login")
    public ResponseEntity<SostenedorRemuneracion> autentificarUsuario(@RequestBody IngresoDTO dto) {
        return new ResponseEntity<>(this.sostenedorRemuneracionUseCase.buscar(dto), HttpStatus.OK);
    }
}
