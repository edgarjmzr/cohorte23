package tiposDeDatosYVariables;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) { //Con que una de las dos se cumpla, es Juan Perez
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		
		boolean esVerdadero = true;
		if (!esVerdadero) { //O es true, o es false.
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		
		
		//EJERCICIO 1
		//Verificar si un número es par y positivo:
			int numEj1 = 6;
			boolean esParYPositivo = numEj1 % 2 == 0 && numEj1 > 0;
			System.out.println(esParYPositivo);
		
		
		
		//EJERCICIO 2
			//Verificar si un número está dentro de un rango específico
			int numEj2 = 10;
			boolean numEstaDentro = numEj2 >11 && numEj2 < 15;
			System.out.println(numEstaDentro);

		
		//EJERCICIO 3
		//Verificar si una cadena es igual a otra o no
		String cadena1 = "Hola";
		String cadena2 = "hola";
		boolean cadenasIguales = cadena1 && cadena2;
		System.out.println(cadenasIguales); //nomas jala con ==?
		
		
		
		
	}

}
