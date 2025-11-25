package com.malek.demographie.repos;

import com.malek.demographie.entities.Demographie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemographieRepository extends JpaRepository<Demographie, Long> {
    Demographie findByDemoCode(String code);
}
