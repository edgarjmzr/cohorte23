package hilos.eejr.pruebas;

import hilos.eejr.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		Hilo2 ht = new Hilo2 ("Gignac");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Samuel")).start();
		new Thread(new Hilo2("Mariana")).start();
		new Thread(new Hilo2("Tesla")).start();
		new Thread(new Hilo2("Elon")).start();
		
	}
}
