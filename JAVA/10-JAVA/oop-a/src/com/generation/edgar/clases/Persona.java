package com.generation.edgar.clases;

public class Persona {
	//attributes
	private String nombre;
	private int edad;
	private int nss;
	
	//empty constructor
	public Persona() {
		
	}
	
	//overcharged constructor, es porque tiene una cantidad de atributos que el otro no
	public Persona(String nombre, int edad, int nss) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	

	
}
