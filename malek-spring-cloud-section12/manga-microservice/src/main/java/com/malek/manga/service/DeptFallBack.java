package com.malek.manga.service;


import com.malek.manga.dto.DemographieDto;
import org.springframework.stereotype.Component;
@Component
public class DeptFallBack implements APIClient {
    @Override
    public DemographieDto getDemoByCode(String demographieCode) {
        return null;
    }
}