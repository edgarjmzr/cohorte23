package funciones;

import java.util.Scanner;

public class Funciones {

	//Las funciones se pueden declarar en cualquier lugar de la clase
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	//funcion para imprimir asteriscos
	public static void imprimirAsteriscos() {
		System.out.println("**********");
	}
	
	
	public static float sumaDecimal(float valor1, int valor2) {
		float resultadoDecimal = valor1 + valor2;
		return resultadoDecimal;
	}
	
	
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	
	
	//Este metodo tine como funcion, ejecutar cosas
	public static void main (String[] args) {
		
		//Las invocaciones de la funcion se hacen de manera general dentro del metodo principal o main
		System.out.println("El resultado de la suma es: " + sumar(5,8));
	
		imprimirAsteriscos();
		
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f,8));
		
		imprimirAsteriscos();
		
		System.out.println("Pasos para preparar aguita de limon: " + awitaDeLimon("agua", "limon", "azucar"));
		
		imprimirAsteriscos();
		
		
		
		
		//funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.65497834d;
		
		System.out.println("La raiz cuadrada de mi valores: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
		
		
		//Calcula la altura de una torre que se encuentra a 100 metros de una persona, que observa la punta de la torre         con un angulo de elevacion de 30°
		/*
		-Torre recta
		-funciones de la libreria math
		-tiempo es de 20 min
		-Impresiones en consola de todos los datos
			/ tu base es de
			/ tu altura es de
		-Datos de tipo double o float
		*/
		
		double distanciaHorizontal = 100.0;
		double anguloElevacion = Math.toRadians(30.0);
		double alturaTorre = distanciaHorizontal * Math.tan(alturaTorre);
		double hipotenusa = distanciaHorizontal/Math.cos(anguloElevacion);
			
		alturaTorre = Math.round(alturaTorre)/100/0; //para redondear a dos decimales
		hipotenusa = Math.round(hipotenusa * 100.0)/100.0;
		
		System.out.println("Tu base es " + distanciaHorizontal + " metros, " + "tu altura es de " + alturaTorre + " metros");
		System.out.println("La hipotenusa es " + hipotenusa);
		}
		
	}
	

}

/*
Funciones
	-que no retornan valores: no devuelve nada, no se especifica nada, y no usamos la palabra return
	-que si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto

- Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }


*/