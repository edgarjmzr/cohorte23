package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@RestController //que eres un controller para soportar metodos http

@RequestMapping(path = "/miOtzo/productos/") //indica la ruta o URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP


public class ProductoController {
	
	
	//Instancia de la clase "ProductoService".
	//Declara la instancia de la Clase ProductoService que se utiliza para acceder a los metodos definidos ahi. Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no cambie durante la ejecucion del programa.
	
	private final ProductoService productoServicio; //no nos llames, nosotros te llamamos
	
	
	@Autowired //Se usa para indicar a Spring que inyecte automaticamente una instancia del ProductoService en la clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase.
	
	
	//Segunda parte de inyeccion de dependencia
	//Constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;	
} //constructor
	
	
	// HTTP GET
	@GetMapping
	public List<Producto> getProducto() {
		return productoServicio.leerProductos();
	}
	/*
	// HTTP POST
	@PostMapping
	public void postProducto()	{
		return productoServicio.crearProducto();
	}
	
	// HTTP PUT
	@PutMapping
	public void putProducto() {
		return productoServicio.actualizarProducto();
	}
	
	// HTTP DELETE
	@DeleteMapping
	public void deleteProducto() {
		return productoServicio.eliminarProducto();
		
	}
	*/
	
}
