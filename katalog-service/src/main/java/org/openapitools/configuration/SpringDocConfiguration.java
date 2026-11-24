package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Katalog API")
                                .description("Dies ist eine API mit der wir Artikel administrieren.")
                                .contact(
                                        new Contact()
                                                .name("KatalogAPI")
                                                .url("https://www.predic8.de")
                                                .email("info@predic8.de")
                                )
                                .version("1.0.0")
                )
        ;
    }
}