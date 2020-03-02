package com.formacionbdi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formacionbdi.springboot.app.item.models.Producto;

//especifica que es un cliente feign
///Interface que se usa para declarar los mappers (endpoints) y la url donde se implementará (antes del balanceador ribbon)
///Este cliente es parecido al ItemServiceImpl, salvo que en Feign se distribuyó la carga del url en otra clase y la implementación que implementa ItemService en ItemServiceFeign 
@FeignClient(name ="servicio-productos",url="localhost:8001")
public interface ProductoClienteRest {
	
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id);
}
