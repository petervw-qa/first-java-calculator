package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Addition addcalc = new Addition();
		System.out.println(addcalc.addition(15, 6));
		
		Subtraction subcalc = new Subtraction();
		System.out.println(subcalc.subtraction(6, 3));
		
		Multiplication multicalc = new Multiplication();
		System.out.println(multicalc.multiplication(10, 20));
		
		Division divcalc = new Division();
		System.out.println(divcalc.division(55, 6));
	}
}
