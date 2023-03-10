package com.generation.edgar.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Division d = new Division(4,0);
	d.visualizarD();
} catch (OpExceptions e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
}
System.out.println("continua...");
	}

}
