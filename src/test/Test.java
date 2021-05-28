package test;

import static org.junit.Assert.*;

import utils.Operaciones;

public class Test {
	Operaciones op = new Operaciones();	

	@org.junit.Test
	public void test() {		 			
		double resultSuma = op.suma(2, 2);			
		assertEquals("Suma 2+2=4", 4.0, resultSuma, 1e-5);			
	}
	
	
	@org.junit.Test
	public void testResta() {
		double result = op.resta(4, 3);
		assertEquals("Resta 4-3", 1.0, result, 1e-5);
			
	}
	
	
	@org.junit.Test
	public void testMulti() {		
		double result = op.multiplicacion(4, 3);
		assertEquals("Multiplicacion 4*3=12", 12.0, result, 1e-5);
			
	}
	
	
	@org.junit.Test
	public void testDivi() {		
		double result = op.division(10, 2);
		assertEquals("Division 10/2=5", 5.0, result, 1e-5);
			
	}
	
	
	
	
	

}
