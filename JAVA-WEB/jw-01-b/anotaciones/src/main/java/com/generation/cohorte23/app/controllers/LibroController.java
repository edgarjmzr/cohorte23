package com.generation.cohorte23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.app.model.Libro;
import com.generation.cohorte23.app.repositories.LibrosRepositorios;

@RestController
public class LibroController {
	
	@Autowired 	
	//permite hacer una instancia, declarando el objeto. 
	//Esta relacionando el controlador con el repositorio.
	//Ya esta instalado en una relacion
	//PENDIENTE INVESTIGAR AUTOWIRED
LibrosRepositorios librosrepositorios;
	
	@RequestMapping("/libros") //cuando en el url le escriba esta direccion, me saldra lo que esta en return
	public List<Libro> listarTodo() {
		return librosrepositorios.listarLibros();
		
	}
}
