package com.example.Petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI petshopOpenAPI() {
      return new OpenAPI()
              .info(new Info().title("Petshop API")
              .description("Petshop API application")
              .version("v2.0")
              .license(new License().name("Apache 2.0").url("http://springdoc.org")));
  }

}
