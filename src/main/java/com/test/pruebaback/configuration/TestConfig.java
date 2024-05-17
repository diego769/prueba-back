package com.test.pruebaback.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@Configuration
public class TestConfig {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private ResourceLoader resourceLoader;

    @Bean
    public ResourceDatabasePopulator resourceDatabasePopulator() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        // Cargar los scripts de carga en el orden adecuado
        populator.addScripts(
                resourceLoader.getResource("classpath:/SQL_Precarga/datos.sql")
        );
        populator.setSqlScriptEncoding("UTF-8");
        populator.execute(dataSource);
        return populator;
    }
}
