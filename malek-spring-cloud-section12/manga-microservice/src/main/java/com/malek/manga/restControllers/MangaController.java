package com.malek.manga.restControllers;

import com.malek.manga.config.Configuration;
import com.malek.manga.dto.APIResponseDto;
import com.malek.manga.dto.MangaDto;
import com.malek.manga.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/mangas")
@AllArgsConstructor
public class MangaController {

    @Autowired
    Configuration configuration;

    private MangaService mangaService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getMangaById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(mangaService.getMangaById(id), HttpStatus.OK);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}