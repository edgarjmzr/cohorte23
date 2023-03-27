package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "detalle_orden")
public class DetalleOrdenModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	
	private Long id;
	private String nombre_detalle_orden;
	
	@ManyToOne
	private ProductoModel producto;
	
	@ManyToOne
	private OrdenModel orden;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_detalle_orden() {
		return nombre_detalle_orden;
	}

	public void setNombre_detalle_orden(String nombre_detalle_orden) {
		this.nombre_detalle_orden = nombre_detalle_orden;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

	public OrdenModel getOrden() {
		return orden;
	}

	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}
	
	
	

}
