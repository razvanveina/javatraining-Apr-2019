package com.savnet.session05;

public class TestTR6 {
	public static double avg(int a, int b) {
		double sum = a + b;
		return sum / 2;
	}

	public static void main(String[] args) {
		System.out.println(avg(6, 7));
		System.out.println(avg(5, 7) + avg(10, 20));
	}
}
