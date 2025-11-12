package com.malek.manga.service;

import com.malek.manga.dto.APIResponseDto;
import com.malek.manga.dto.MangaDto;

public interface MangaService {
    APIResponseDto getMangaById(Long id);
}