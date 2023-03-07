package oop.clases;

public class Fecha extends Object {
private int dia;
private int mes;
private int ano;

public Fecha() {
	
}

public String diaMesAno() {
	return "La fecha es: dia "  + this.dia 
			+ "mes " + this.mes + "ano " +  this.ano;
}

public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}


}
