package com.sophossolutions.devops;

public class Calculator {

	public static int add(int s1, int s2) {
		return s1 + s2;
	}

	public static int divide(int dividend, int divisor) throws ArithmeticException {
		if(divisor == 0) {
			throw new ArithmeticException("Division by zero");
		}
		return dividend / divisor;
	}

}
