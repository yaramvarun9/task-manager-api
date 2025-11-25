package com.taskmanager.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for OpenAPI (Swagger UI) documentation using SpringDoc.
 * * NOTE: For this configuration to work, you must include the 'springdoc-openapi-starter-webmvc-ui'
 * dependency in your project's build file (e.g., pom.xml).
 */
@Configuration
public class OpenApiConfig {

    /**
     * Defines the custom metadata for the OpenAPI documentation.
     * @return The configured OpenAPI object.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Task Manager REST API")
                        .version("1.0.0")
                        .description("A sample RESTful API for managing user tasks, demonstrating a standard Spring Boot layered architecture.")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}