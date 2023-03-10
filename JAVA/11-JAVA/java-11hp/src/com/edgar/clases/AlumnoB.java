package com.edgar.clases;

public class AlumnoB {
private int matricula;
private double promedio;

public AlumnoB(int matriculas, double promedio, String nombre, int edad) {
	super(nombre, edad);
	this.matricula = matricula;
	this.promedio = promedio;
}



public int getMatriculas() {
	return matricula;
}
public void setMatriculas(int matriculas) {
	this.matricula = matriculas;
}
public double getPromedio() {
	return promedio;
}
public void setPromedio(double promedio) {
	this.promedio = promedio;
}
@Override
public String toString() {
	return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
}
public String mostrarDatos() {
	System.out.println(this.getNombre()+" "+this.getEdad()+" "+this.matricula+" "+this.promedio);
}


}