package com.example;

import com.example.service.EquipoService;
import com.example.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasketApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BasketApplication.class, args);
		JugadorService jugadorService = context.getBean(JugadorService.class);
		EquipoService equipoService = context.getBean(EquipoService.class);

		jugadorService.testGamers();
		equipoService.testSquad();
	}
}
