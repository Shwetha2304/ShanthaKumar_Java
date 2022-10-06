package com.valtech.training.corejava.day5;

public class FactorialRecursion {
	public static long fact(long n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String args[]) {
		System.out.println("The factorial of 12 is: " + fact(12));
	}
}
