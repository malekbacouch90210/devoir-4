package com.malek.manga.service;

import com.malek.manga.dto.APIResponseDto;
import com.malek.manga.dto.DemographieDto;
import com.malek.manga.dto.MangaDto;
import com.malek.manga.entities.Manga;
import com.malek.manga.repos.MangaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class MangaServiceImpl implements MangaService {
    private MangaRepository mangaRepository;

    private WebClient webClient;

    private APIClient apiClient;

    @Override
    public APIResponseDto getMangaById(Long id) {
        Manga manga = mangaRepository.findById(id).get();
        DemographieDto demographieDto = apiClient.getDemoByCode(manga.getDemoCode());
//        DemographieDto demographieDto = webClient.get()
//                .uri("http://localhost:8085/api/demographies/" + manga.getDemoCode())
//                .retrieve()
//                .bodyToMono(DemographieDto.class)
//                .block();
        MangaDto mangaDto = new MangaDto(
                manga.getId(),
                manga.getMangaName(),
                manga.getMangaka(),
                manga.getDemoCode(),
                demographieDto.getDemoName()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMangaDto(mangaDto);
        apiResponseDto.setDemographieDto(demographieDto);
        return apiResponseDto;
    }
}