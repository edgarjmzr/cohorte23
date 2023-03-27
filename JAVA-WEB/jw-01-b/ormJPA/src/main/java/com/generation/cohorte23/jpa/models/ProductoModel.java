package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(unique = true, nullable = false)
	 private Long id;
	 private String nombre_producto;
	
	 @ManyToOne
	 //de los productos al usuario
	 private UsuarioModel usuario;
	 
	 @OneToMany (mappedBy = "producto") //producto con many detalle_orden
	    private ArrayList<DetalleOrdenModel> detalle_orden;
	 
	 
	// empty constructor
	public ProductoModel() {

	}

	//Constructor using fields
	public ProductoModel(Long id, String nombre_producto, UsuarioModel usuario) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		this.usuario = usuario;
	}
	///////////////

	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	/////////////
	
	

}
