package ciclos.loopsForWhileDo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("el iterador --"+ i);
		}
		
	}
	
public void letrasFor() {
	System.out.println("For con letras");
	for (int i = 'A'; i <= 'Z'; i++) { //int no tiene problema porque esta agarrando el numero de ascii
		System.out.print("soy --> "+ i + ", ");
		char letra = (char)	i;
		System.out.println("ahora en letras");
		System.out.println("soy ---->" + letra + ", ");
		
		//System.out.print("soy --> "+ (char)i + ", "); otra solucion para convertir el ascii a caracter
	}
}

}
