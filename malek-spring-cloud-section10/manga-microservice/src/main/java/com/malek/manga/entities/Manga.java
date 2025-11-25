package com.malek.manga.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Manga {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String MangaName;
    private String Mangaka;
    private String demoCode;
    private String demoName;
}
