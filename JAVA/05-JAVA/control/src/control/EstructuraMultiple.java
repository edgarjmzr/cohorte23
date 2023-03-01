package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);

	public void vocal() {
		System.out.println("Introduzca una letra: ");
		char letra = dato.next().charAt(0); // charAt se refiere al indice 0
		switch (letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("El caracter " + letra + " es vocal");
			break;

		default: // caso no contemplado, como el else
			System.out.println("El caracter " + letra + " no es vocal");
			break;
		}

	}

	public void Calificaciones() {
		System.out.println("Introduzca su calificacion: ");
		int Calificacion = dato.nextInt();
		switch (Calificacion) {
		case 10:
			System.out.println("Excelente");
			break;
		case 9:
			System.out.println("Muy bueno");
			break;
		case 8:
			System.out.println("Bueno");
			break;
		case 7:
			System.out.println("Regular");
			break;
		case 6:
			System.out.println("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobatorio");
			break;

		default:
			System.out.println("");
			break;
		}

	}

	/*
	 * ?: Operador Elvis cocho o ternario variable = (PL) ? entrada verdad : entrada
	 * falso
	 */

	public void ternario() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un valor numerico: ");
		int entradaV = dato.nextInt();
		System.out.println("Introduzca un segundo valor numerico: ");
		int entradaF = dato.nextInt();
		int CualEsMenor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("este numero es el menor  --->" + CualEsMenor);
	}

}
