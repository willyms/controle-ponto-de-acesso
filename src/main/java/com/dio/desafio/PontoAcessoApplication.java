package com.dio.desafio;

import lombok.extern.log4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import springfox.documentation.swagger2.annotations.*;

@Log4j2
@EnableSwagger2
@SpringBootApplication
public class PontoAcessoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PontoAcessoApplication.class, args);
    }
}
