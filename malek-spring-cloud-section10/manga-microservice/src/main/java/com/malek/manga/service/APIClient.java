package com.malek.manga.service;

import com.malek.manga.dto.DemographieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8085", value = "DEMOGRAPHIE")

@FeignClient(name = "DEMOGRAPHIE-MICROSERVICE")
public interface APIClient {
    @GetMapping("api/demographies/{demographie-code}")
    DemographieDto getDemoByCode(
            @PathVariable("demographie-code")
            String demographieCode
    );
}
