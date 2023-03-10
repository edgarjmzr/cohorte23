package com.generation.edgar.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("introduce un valor: ");
		int divisor;
			
		
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("--->"+division);
			
		}catch (ArithmeticException e) { //ArithmeticException es mas precisa que Exception
			System.out.println("capturando la exception" + e.getMessage());
			
		}catch (NumberFormatException nfe) { 
			
			System.out.println("ingresaste un caracter, por favor ingresa un numero. Codigo de error: " + nfe.getMessage());
		}finally {
			System.out.println("Este block es opcional y se va a  ejecutar con o sin la exception2");
		}
		
		System.out.println("continuamos el flujo de la aplicacion");
		
	}
}
