package com.malek.demographie.service;

import com.malek.demographie.dto.DemographieDto;

public interface DemographieService {
    DemographieDto getDemographieByCode(String code);
}
