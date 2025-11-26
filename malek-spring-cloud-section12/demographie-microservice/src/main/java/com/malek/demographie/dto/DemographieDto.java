package com.malek.demographie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemographieDto {
    private Long id;
    private String demoName;
    private String demoCode;

}
