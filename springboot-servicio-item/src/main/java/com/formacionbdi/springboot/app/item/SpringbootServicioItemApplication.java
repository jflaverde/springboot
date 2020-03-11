package com.formacionbdi.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableEurekaClient
///Anotación de RibbonClient
///Si tuvieramos más servicios usariamos RibbonClient(s)
///Se especifica el servicio al cual vamos a conectarnos. Descrito en el application.properties del proyecto del micro servicio
//@RibbonClient(name="servicio-productos")
///Habilita el cliente de Feign en el proyecto.
///habilitar nuestros clientes feign que tengamos implementados en nuestro proyecto
///permite inyectar estos clientes en nuestros controladores u otros componentes spring, servicios habilita el autowired
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
