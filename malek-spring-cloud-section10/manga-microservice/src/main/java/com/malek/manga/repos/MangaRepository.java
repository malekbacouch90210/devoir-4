package com.malek.manga.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.malek.manga.entities.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> { }