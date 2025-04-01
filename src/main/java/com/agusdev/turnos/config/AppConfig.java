package com.agusdev.turnos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class AppConfig {

    @Bean("apiConsumir")
    public RestTemplate registrarRestTemplate(){
        return new RestTemplate();
    }

}
