package test;

import static org.junit.Assert.*;

import utils.Operaciones;

public class Test {

	@SuppressWarnings("deprecation")
	@org.junit.Test
	public void test() {
		Operaciones op = new Operaciones();	
		double resultSuma = op.suma(2, 2);	
		System.out.println(resultSuma);
		assertEquals("Suma 2+2=4", 4.0, resultSuma, 1e-5);		
	}
	
	
	

}
