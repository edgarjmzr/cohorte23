package ciclos.control;

import java.util.Scanner;
import ciclos.loopsForWhileDo.UsoWhile;

public class DoSwitch {
public void controlador() {
	Scanner s= new Scanner(System.in);
	Menus mp = new Menus();
	UsoWhile uwu
	
	int opcion = 0;
	do {
		mp.menuPrincipal();
		System.out.println("Introduzca un op: ");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			uwu.cicloW();			
			break;
		case 2:
			uwu.centinelaW();			
			break;
		case 3:
			uwu.banderaW();			
			break;
		case 4:
			uf.cicloFor();			
			break;
		case 4:
			uf.cicloFor();			
			break;
			

		default:
			break;
		}
		
	} while (opcion);

}
}
