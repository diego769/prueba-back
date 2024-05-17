package com.test.pruebaback.configuration.useCase;

import com.test.pruebaback.core.useCase.SostenedorRemuneracionInterface;
import com.test.pruebaback.core.useCase.SostenedorRemuneracionUseCase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SostenedorRemuneracionConfig {
    @Bean
    public SostenedorRemuneracionUseCase getSostenedorRemuneracionUseCase(
            @Qualifier("SostenedorRemuneracionDataProviders")SostenedorRemuneracionInterface sostenedorRemuneracionInterface
            ) {
        return new SostenedorRemuneracionUseCase(sostenedorRemuneracionInterface);
    }
}
