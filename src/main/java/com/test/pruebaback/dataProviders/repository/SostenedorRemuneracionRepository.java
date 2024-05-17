package com.test.pruebaback.dataProviders.repository;

import com.test.pruebaback.dataProviders.entity.SostenedorRemuneracionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SostenedorRemuneracionRepository extends JpaRepository<SostenedorRemuneracionEntity,Integer>, JpaSpecificationExecutor<SostenedorRemuneracionEntity> {

    SostenedorRemuneracionEntity findByRutSostenedor(String rutSostenedor);
}
