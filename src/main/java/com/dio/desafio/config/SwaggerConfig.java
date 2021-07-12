package com.dio.desafio.config;

import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.schema.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.swagger2.annotations.*;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dio.desafio.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API-REST")
                .description("Sistema de Controle Ponto Acesso")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("DIO", "https://web.digitalinnovation.one", "contato@digitalinnovationone.com.br"))
                .build();
    }


}


