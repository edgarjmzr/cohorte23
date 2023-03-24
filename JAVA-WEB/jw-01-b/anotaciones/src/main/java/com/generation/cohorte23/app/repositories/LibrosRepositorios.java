package com.generation.cohorte23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.cohorte23.app.model.Libro;

@Repository
public class LibrosRepositorios {
public List<Libro> listarLibros() {
	List<Libro> lista = new ArrayList<Libro>();
	lista.add(new Libro("Spring Boot", "Vic", "12312443"));
	lista.add(new Libro("JAVAli", "Daniel Morales", "8112347892"));
	lista.add(new Libro("C mamut", "Daniel Morales", "8112347892"));
	
	return lista;
}
}
