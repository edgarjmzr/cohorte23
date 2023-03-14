package pruebasJunit.eejr.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.eejr.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("ejecutando BeforeEach ---> configurandoBefore()");
	}
	
	@AfterEach
	public void configurandoAfter() {
		// TODO Auto-generated method stub
		ct = null;
 System.out.println("Ejecutando AfterEach() ---> configurandoAfter() ");
 System.out.println("************************************************");
	}
	
	@Test
	public void calculadoraNull() {
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("ejecutando primer test ---> calculadora");
	}
	/*	
*/


@Test
public void calculadoraNotNull() {
	// TODO Auto-generated method stub
	assertNotNull(ct, "La clase es instanciada ");
	System.out.println("ejecutando segundo test ---> calculadora");
}

/***********primeras pruebas*************/
@Test
public void primerosAssert() {
	/*
	 * 1. Indicar que es lo que se va a evualuar
	 * 2. Indicar lo que se va a realizar
	 * 3. Evaluar con el assert indicador
	 */
	int resultadoEsperado = 10;
	int resultadoActual;
	resultadoActual = ct.sumar(7, 3);
	assertEquals(resultadoEsperado, resultadoActual);
	System.out.println("Ejecutando tercer test ---> primerosAssert()");
}

@Test
public void sumaTest() {
	Calculadora calculadora = new Calculadora();
	assertEquals(20, calculadora.sumar(10, 10));
	System.out.println("Ejecutando cuarto test ---> primerosAssert()");
}
	
/*********** TIPOS TEST *************/
@Test
public void tiposAssert() {
	
	assertTrue(1 == 1);
	assertEquals("Generation", "Generation");
	assertNull(ct1);
	Calculadora c1 = new Calculadora();
	Calculadora c2 = new Calculadora();
	Calculadora c3 = c1;
	
	assertSame(c1, c3);
	assertNotSame(c2, c3);
	assertEquals(1, .5,.5);

}

@Test
public void validandosuma() {
	assertEquals(11, ct.sumar(5, 6));

}

@Test
public void validandoresta() {
assertEquals(50, ct.restar(56, 6));
}

@Test
public void validandoRestaNegativa() {
	assertEquals(-10, ct.restar(10, 20));
}

@Test
public void validandoDivision() {
assertEquals(25, ct.division(100, 4));
}

/*
@Test
public void validandoDivisionByZero() {
assertThrows(ArithmeticException.class, ()->ct.divisionByZero(10, 0), "no se pudo");
}
 */

@Disabled ("En espera") //con este desactivamos un test
@Test
public void validandoByZero() {
	assertThrows(ArithmeticException.class, ()->ct.divisionByZero(10, 0), "no se pudo");

}
}
