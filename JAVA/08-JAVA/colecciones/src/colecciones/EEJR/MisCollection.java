package colecciones.EEJR;

import java.util.*;


public class MisCollection {
	
	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		mapCollections();
		
		//wrapperClass();
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("key1", "value1");
		miMap.put("key2", "value2");
		miMap.put("key3", "value3");
		miMap.put("key4", "value4");
		//miMap.clear();
		//miMap.remove("key3);
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		

		
		
		return miMap;
	}
	
	
	Set setCollections() {
	Set miSet = new HashSet();
	miSet.add("uno");
	miSet.add("dos");
	miSet.add("tres");
	miSet.add("cuatro");
	
	miSet.remove("uno"); //Hay que especificar el string para remover en el arreglo
	System.out.println("tamano de la lista " + miSet.size());
	//miSet.clear(); //elimina toda la lista
	boolean e = miSet.isEmpty(); //revisa documentacion porque si esta vacio retorna automaticamente falso
	
	System.out.println("-->"+ e);
	
	Object a[] = miSet.toArray();
	for (int i = 0; i < a.length; i++) {
		System.out.println("Este es un set en arreglo " + a[i]);
	}
	
	
				return miSet;
	}
	
	private List listaCollections() {
		//method
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamano de la lista antes " + miLista.size());
		System.out.println("esta vacia "+ miLista.isEmpty());
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0,"Pato");
		
		miLista.set(0,miLista);
		miLista.remove(2);
		
		System.out.println(miLista + "Tamano de la lista despues " + miLista.size());
		System.out.println("esta vacia "+ miLista.isEmpty());

		boolean e = miLista.contains(0);
		System.out.println("-->" +e);
		
		return miLista;
	} 
	
	private static void imprimir(Collection collection) {
		for (Object elementos: collection) {
			System.out.println("elementos " + elementos);
			
		}
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
