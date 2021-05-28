package utils;

public class Operaciones {
	
	
	public double suma(double a, double b) {
		return a+b;		
	}
	
	public double resta(double a, double b) {
		return a-b;		
	}
	
	public double multiplicacion(double a, double b) {
		return a*b;		
	}
	
	public double division(double a, double b) {
		return a/b;		
	}
	
	public double sqrt(double a) {
		double result = 1.0;
		for(int i = 1; i < 200; i++) {
			result = (result + a/result) /2;
		}
		return result;
	}

}
