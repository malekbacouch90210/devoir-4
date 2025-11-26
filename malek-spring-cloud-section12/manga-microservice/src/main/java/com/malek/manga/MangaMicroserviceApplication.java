package com.malek.manga;

import com.malek.manga.entities.Manga;
import com.malek.manga.repos.MangaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class MangaMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangaMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(MangaRepository teacherRepository) {
        return args -> {
            teacherRepository.save(Manga.builder()
                    .MangaName("Dragon ball")
                    .Mangaka("Akira toriyama")
                    .demoCode("SHN")
                    .build());
        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
