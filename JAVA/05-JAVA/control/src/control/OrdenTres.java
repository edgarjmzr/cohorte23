package control;

import java.util.*;
import java.io.*;

public class OrdenTres {
	Scanner dato = new Scanner(System.in);

	//Recibir 3 valores, y ordenarlos de mayor a menor
	
	public void tres() {
		System.out.println("Introduzca un primer valor numerico: ");
		int entradaA = dato.nextInt();
		System.out.println("Introduzca un segundo valor numerico: ");
		int entradaB = dato.nextInt();
		System.out.println("Introduzca un tercer valor numerico: ");
		int entradaC = dato.nextInt();
		
		int[] myNum = {entradaA,entradaB,entradaC};
		Arrays.sort(myNum);
		System.out.print("Los numeros ordenados ascendentemente son: " + Arrays.toString(myNum));
		
		//int[] myNum1= {entradaA,entradaB,entradaC};
		Collections.reverse(Arrays.asList(myNum));

		System.out.print(Arrays.toString(myNum));
		
	
		
		/*System.out.print(myNum[0]);
		System.out.print(myNum[1]);
		System.out.print(myNum[2]);
		
		
		
		
		*/
		
		
	/*	if (entradaA 1 ) {
    		
    	} else if (condition) {
    	
    	} else {
    		
    	}*/
	} 
}
