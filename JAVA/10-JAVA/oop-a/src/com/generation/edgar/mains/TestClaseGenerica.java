package com.generation.edgar.mains;

import com.generation.edgar.clases.ClaseGenerica;

public class TestClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica<String> caracteresObj = new ClaseGenerica<String>("Prueba");
		intObj.claseTipo();
		caracteresObj.claseTipo();
		
		
	}

}
