package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Victor y CH");
		nh.saludo();
		
		String nombre;
		System.out.println("Cual es tu noombree ");
		nombre = sn.next(); //nextLine puedo agregar dos palabras
		
		NuevoHola nh1 = new NuevoHola(nombre);
		nh1.saludoConNombre();
	}

}
