package com.formacionbdi.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

///Implementación del RestTemplate para interactuar con otros servicios la anotación es @Configuration
@Configuration
public class AppConfig {
	
	///Cada método se anota con un Bean
	@Bean("clienteRest") 
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
