package com.generation.edgar.clases;

public class AreaPerimetro {

	public double areaCuadrado(double lado) {
		double area = lado * lado;

		return area;
	}

	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public double areaTriangulo(int base, int altura) {
		return (base*altura)/2;
	}
	
	//instancia para triangulo y area y perimetro para circulo
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
	return (ladoA + ladoB + ladoC);
	}
	
	public double areaCirculo() {
	return 0;
	}
	
	public double perimetroCirculo() {
		return 0;
		
		
	}
	
	
}

