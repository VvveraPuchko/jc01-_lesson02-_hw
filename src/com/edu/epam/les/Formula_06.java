package com.edu.epam.les;

public class Formula_06 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a = 2;
		b = 20;
		c = 1;
		
		double rez;
		
		rez = b + Math.sqrt(b*b - 4 * a * c)/(2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
		System.out.println(rez);
	}

}
