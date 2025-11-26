package com.malek.demographie;

import com.malek.demographie.entities.Demographie;
import com.malek.demographie.repos.DemographieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemographieMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemographieMicroserviceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(DemographieRepository demographieRepository) {
        return args -> {
            demographieRepository.save(Demographie.builder()
                    .demoName("Shonen")
                    .demoCode("SHN")
                    .build());

            demographieRepository.save(Demographie.builder()
                    .demoName("Seinen")
                    .demoCode("SNN")
                    .build());
        };
    }


}
