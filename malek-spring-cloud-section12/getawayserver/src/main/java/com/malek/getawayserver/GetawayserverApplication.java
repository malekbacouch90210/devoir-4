package com.malek.getawayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetawayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetawayserverApplication.class, args);
    }


    @Bean
    public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/api/demographies/**")
                        .uri("lb://DEMOGRAPHIE-MICROSERVICE"))
                .route(p -> p
                        .path("/api/mangas/**")
                        .filters( f -> f.circuitBreaker(config ->
                                config.setName("teacherCircuitBreaker")))
                        .uri("lb://MANGA-MICROSERVICE"))
                .build();
    }

}
