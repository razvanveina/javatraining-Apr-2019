package com.savnet.session04;

public class ReturnThing {
	public static void main(String[] args) {
		System.out.println(add(5, 7));
	}

	private static int add(int a, int b) {
		if (a > b) {
			return a + b;
		}
		return -1;
	}

	private static void add() {

	}

	private static void add2() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				return;
			}
		}
	}
}
