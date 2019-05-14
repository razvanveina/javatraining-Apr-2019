package com.savnet.session09.recursivity;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	private static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	private static int fibo2(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
