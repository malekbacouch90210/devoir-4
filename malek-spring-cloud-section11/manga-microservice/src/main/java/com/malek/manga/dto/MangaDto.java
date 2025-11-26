package com.malek.manga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MangaDto {
    private Long id;
    private String MangaName;
    private String Mangaka;
    private String demoName;
    private String demoCode;
}