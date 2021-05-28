package test;

import junit.framework.TestCase;
import utils.Operaciones;

public class Test extends TestCase {	
	
	
	Operaciones op = new Operaciones();
	
	double resultSuma = op.suma(2, 2);
	
	assertEquals("2+2 = 4", 2+2, resultSuma);
	

}
