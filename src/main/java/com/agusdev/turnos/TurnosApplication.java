package com.agusdev.turnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TurnosApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando");
		SpringApplication.run(TurnosApplication.class, args);
		System.out.println("Iniciado");
	}
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}