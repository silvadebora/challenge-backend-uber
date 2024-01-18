package com.uber.emailservice.infra.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public GroupedOpenApi api(){
        return GroupedOpenApi.builder()
                .group("uber-backend")
                .pathsToMatch("/api/email")
                .build();
    }

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(
                new Info()
                        .title("Desafio Backend Uber")
                        .description("Email Microservice"));
    }

}
