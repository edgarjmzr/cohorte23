package clases;

import java.util.Scanner;



public class NuevoHola {
	

	private String nombre; //nombre es una variable pero objeto investigar mas sobre esto
	// para inicializar una variable (objeto del tipo string),
	// usamos el metodo constructor

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez " + this.nombre);
	}
		public void saludoConNombre() {
		System.out.print("Que onda compare como anda " + this.nombre);
		}
	
}

