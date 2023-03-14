package pruebasJunit.eejr.app;

public class Calculadora {
	
 public int sumar(int n1, int n2) {
	 
	return n1+n2;

 }
 
 public int restar(int n1, int n2) {
	 return n1-n2;
 }
 
 public double division(double d1, double d2) {
	 return d1 / d2;
 }
 
 public double divisionByZero(double dz1, double dz2) {
if (dz2 == 0) {
	throw new ArithmeticException("que pedo weeee no uses 0 no mamss");
}
return dz1 / dz2;
}
}
