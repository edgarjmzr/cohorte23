package tiposDeDatosYVariables;

public class TiposDeDatosYVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
		 byte horasTrabajadas = 8;
		 byte pago = 10;
		 int multiplicacion = horasTrabajadas * pago;
		 System.out.println("el pago total es " + multiplicacion);
		 
		 //conversiones
		 double num = 1.61;
		 int numInt = (int)num; // con esto cambiamos el numero con decimales a entero
		 long numLong = (long)num; //la vdd no se pa que lo queremos cambiar a long, es el mas grande

		 System.out.println("double " + num);
		 System.out.println("int " + numInt);
		 System.out.println("long " + numLong);
		 
		//conversion de string

		 String cantidad = "15";
		 String precio = "115.20";
		 


		 int cantEntero = Integer.parseInt(cantidad);  //convierte a numero con enteros
		 double precioDouble = Double.parseDouble(precio); //convierte a numero con decimales


		 System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
	
		
		 
		 
		 int edad = 30;
		 double estatura = 1.61;
		  

		 String edadString = String.valueOf (edad);
		 String estaturaString = String.valueOf (estatura); //y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

		 System.out.println("Edad: " + edadString + estatura + estaturaString);

		 int numero1 = 5;
	        int numero2 = 7;
	        int numero3 =12;
	        
	        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
	        int resta = numero1 - numero2 - numero3; //esperamos -14
	        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
	        int división = numero2 / numero1; //operador /, esperamos 1,4
	        int modulo = numero2 % numero1; //operador %, esperamos un 2. Solo da el residuo
	        int incremento = ++numero3;
	        int decremento= --numero2;
	        
	        System.out.println("La suma es: "+ suma);
	        System.out.println("La resta es: "+ resta);
	        System.out.println("La multiplicación es: "+ multiplicación);
	        System.out.println("La división es: "+ división);
	        System.out.println("La modulo es: "+ modulo);
	        System.out.println("El incremento es: "+ incremento);
	        System.out.println("El decremento: "+ decremento);
	        
	        
	        // Otro ejemplo pa q no digan
	        
	    byte num1 = 3; //yo estoy usando otros que fer
        byte num2 = 2;
        byte num3 = 2;
        byte num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
	                
	           
        /*
        Ejercicio 1
        Declara 3 variables de tipo entero y utiliza el operador * y %
        */
        
        byte numA = 5;
        byte numB = 55;
        byte numC = 60;
        int multiplicacionEj1 = numA * numC;
        int residuoEj1 = numC % numB;
        
        System.out.println("la multiplicacion es: " + multiplicacionEj1);
        System.out.println("el residuo es: " + residuoEj1);
        

        /*Ejercicio 2
        Declara dos variables de tipo boolean y utiliza el operador == */
        
        boolean correcto = true;
        boolean incorrecto = false;
        System.out.println(correcto == incorrecto);
        

        /*Ejercicio 3
        Declara dos variables de tipo Double y utiliza el operador <
        */
        double numDecimal1 = 5.55;
        double numDecimal2 = 6.66;
        System.out.println(numDecimal1>numDecimal2);
        
        
        //farenheit a kelvin y a C
        byte fahrenheitN = 100;
        double celsiusN = (fahrenheitN - 32) / 1.8;
        double kelvinN = (fahrenheitN - 32) / 1.8 + 273.15;

        System.out.println("100 grados fahrenheit a celsius es " + celsiusN);

        System.out.println("100 grados fahrenheit a kelvin es " + kelvinN);
        
      //fahrenheit a celcius //(32 °F − 32) × 5/9 = 0 °C
      //fahrenheit a Kelvin //(32 °F − 32) × 5/9 + 273.15 = 273.15 K
        
        
        //Verificar si un Numero es par o impar
        System.out.println( (4 % 2) == 0);
        if (4%2 == 0) {
        	System.out.print("Es par");
        }
        else {
        	System.out.print("Es impar");
        }
        

   
		 
	}
	


}


/*
* datos primitivos
* Los unicos que llevan letra al final son long, float y double
 
byte: Sirve para representar un valor numerico de 8 bits (-128 al 127) 
short:Sirve para representar un valor numerico de 16 bits (-32,768 al 32767)
int: de tipo entero (sirve para representar un valor numerico de 32 bits (-(-2147483648 al 2147483647)
)
long: Sirve para representar un valor numerico ((-9223372036854775808 al 9223372036854775807)
)y se le agrega una l al final
float: Sirve para representar un valor numerico de 23 bits (numeros decimales)al final lleva una f
double: Sirve para representar un valor numerico de 64 bits (numeros decimales) al final lleva una letra d
boolean:Sirve para representar valores booleanos (0 y  1 o true or false)1 bit
char: Sirve para representar un caracter de 16 bits, entre comillas simples.*/
