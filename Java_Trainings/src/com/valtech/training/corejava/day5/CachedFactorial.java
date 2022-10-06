package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;

public class CachedFactorial {
	List<Long> cache = new ArrayList<>();

	public long factorial(int n) {
		// Check list size, if greater than n return element
		if (cache.size() >= n) {
			System.out.println("Returning from cache");
			return cache.get(n - 1);
		}

		// Else compute factorials from size till n
		// Store the values of all factorials btw size 0 to n
		if (n == 1) {
			cache.add(1L);
			return 1;
		}
		long fact = factorial(n - 1);
		long factn = n * fact;
		cache.add(factn);
		return factn;

	}
}
