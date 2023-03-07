package com.generation.edgar.clases;

public class Taco {
	public String tipoDeTortilla;
	public String guisado;
	public int numeroDeTortilla;
	public String tamanoDeTortilla;
	public Float precio;
	
	//constructor
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanoDeTortilla, Float precio) {
		super(); //??
		
	}
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}
	public String getTamanoDeTortilla() {
		return tamanoDeTortilla;
	}
	public void setTamanoDeTortilla(String tamanoDeTortilla) {
		this.tamanoDeTortilla = tamanoDeTortilla;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	
}
