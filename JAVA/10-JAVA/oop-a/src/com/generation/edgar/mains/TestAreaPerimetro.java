package com.generation.edgar.mains;

import com.generation.edgar.clases.AreaPerimetro;
import com.generation.edgar.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("-->"+ap.Area()); //?
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado--> "+ fg.getPerimetro());
		
	}

}
