package com.educiupi.educiupiapp.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springdoc.core.GroupedOpenApi;
//import org.springdoc.core.SwaggerUiConfigParameters;
//import org.springdoc.core.SwaggerUiConfigParametersBuilder;

@Configuration
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
            .group("public-api")
            .packagesToScan("com/educiupi/educiupiapp/controller") // Specify packages to scan for API endpoints
            .build();
    }

//    @Bean
//    public SwaggerUiConfigParameters swaggerUiConfigParameters() {
//        return new SwaggerUiConfigParametersBuilder()
//            .withDefaultUrl("/api-docs") // Set the default URL for accessing the API documentation UI
//            .build();
//    }
}
