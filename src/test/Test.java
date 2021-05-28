package test;

import static org.junit.Assert.*;

import utils.Operaciones;

public class Test {

	@org.junit.Test
	public void test() {
		Operaciones op = new Operaciones();	
		
		double resultSuma = op.suma(2, 2);			
		assertEquals("Suma 2+2=4", 4.0, resultSuma, 1e-5);
			
	}
	
	
	@org.junit.Test
	public void testResta() {
		Operaciones op = new Operaciones();	
		
		double resultResta = op.resta(4, 3);
		assertEquals("Resta 4-3", 1.0, resultResta, 1e-5);
			
	}
	
	
	
	
	

}
