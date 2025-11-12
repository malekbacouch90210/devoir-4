package com.malek.demographie.service;

import com.malek.demographie.dto.DemographieDto;
import com.malek.demographie.entities.Demographie;
import com.malek.demographie.repos.DemographieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemographieServiceImpl implements DemographieService {

    @Autowired
    DemographieRepository demographieRepository;

    @Override
    public DemographieDto getDemographieByCode(String code) {
        Demographie demo = demographieRepository.findByDemoCode(code);
        DemographieDto demographieDto = new DemographieDto(
                demo.getId(),
                demo.getDemoName(),
                demo.getDemoCode()
        );
        return demographieDto;
    }
}
