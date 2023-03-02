package ciclos.loopsForWhileDo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);

	public void cicloW() 
	System.out.println("Ciclo While");
		// TODO Auto-generated method stub
			int iterador = 0;
			while (iterador < 10) {
				System.out.println("Nuestro Iterador es: " + iterador);
				iterador = iterador +1;
			}
	}

 /*while uso centinela*/
	public void centinelaW() {
		final int centinela = -1; //final palabra predefinida constante. Access modifier. determina el final
		System.out.print("Introduce una calificacion: ");
		int nota = entrada.nextInt();
		while (nota != centinela) { //!= different
			System.out.println("La nota es: " + nota); // iniciaria otra vez el while, infinitamente
			System.out.println("Introduce una nota: ");
			nota = entrada.nextInt(); //reasigno valor a nota, de manera que puedo terminar el loop
		}
		System.out.println("Fin");
	}
	
	public void banderaW() {
		boolean valorb = false;
		while (!valorb) { //!valorb 
			System.out.print("Introduzca un numero: ");
			int valorx = entrada.nextInt();
			if (valorx > 0 && valorx < 5) {
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println("el resultado es: " + potaxio);
			} else {
				valorb = true;
				System.out.println("byeee");
			}
			
		}
	}
	
	
	
	
	/*public static double banderaW() {
		System.out.println("hola soy el metodo static");
		Math.pow(2, 2); //2 elevado a la 2
		return 0.0;
	}
	*/
}

