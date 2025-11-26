package com.malek.manga.service;

import com.malek.manga.dto.DemographieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8085", value = "DEMOGRAPHIE")

// Fichier : manga-microservice/src/main/java/com/malek/manga/service/APIClient.java

@FeignClient(name = "DEMOGRAPHIE-MICROSERVICE")  // ← EXACTEMENT comme dans application.yml
public interface APIClient {

    @GetMapping("/api/demographies/{demographie-code}")  // ← avec le / au début
    DemographieDto getDemoByCode(@PathVariable("demographie-code") String demographieCode);
}