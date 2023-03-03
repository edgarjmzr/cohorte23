package colecciones.EEJR;

import java.util.ArrayList;
import java.util.List;

public class MisCollection {
	
	public static void main(String[] args) {
		
		wrapperClass();
	}
	
	private void listasCollections() {
		//method
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);

	} 
	
	 static void wrapperClass() {
		// byte, short, char, long, float, int, double
		 
		 byte numeroB = 127;
		 System.out.println("Tamano de un byte" + Byte.SIZE);
		 System.out.println("Valor Max " + Byte.MAX_VALUE);
		 System.out.println("Valor Min " + Byte.MIN_VALUE);
		 System.out.println("--->" +numeroB);
		 
		 int numeroI = 12222;
		 System.out.println("Tamano de un entero bytes: " + Integer.BYTES);
		 System.out.println("Tamano de un entero: " + Integer.BYTES);
		 System.out.println("Valor Max " + Integer.MAX_VALUE);
		 System.out.println("Valor Min " + Integer.MIN_VALUE);
		 System.out.println("--->" +numeroI);
		 
		 //short
		 short numeroS = 32767;
		 System.out.println("Tamano de un short bytes: " + Short.BYTES);
		 System.out.println("Tamano de un short: " + Short.BYTES);
		 System.out.println("Valor Max " + Short.MAX_VALUE);
		 System.out.println("Valor Min " + Short.MIN_VALUE);
		 System.out.println("--->" +numeroS);
		 
		 //long
		 long numeroL = 9223372036854775807L;
		 System.out.println("Tamano de un long bytes: " + Long.BYTES);
		 System.out.println("Tamano de un long: " + Long.BYTES);
		 System.out.println("Valor Max " + Long.MAX_VALUE);
		 System.out.println("Valor Min " + Long.MIN_VALUE);
		 System.out.println("--->" +numeroL);
		 
		 
		 //corroborenlos tamanos decada uno
	}
}
