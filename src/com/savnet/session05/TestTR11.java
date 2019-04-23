package com.savnet.session05;

public class TestTR11 {
	public static boolean isEven(int n) {
//		if (n % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}

		// boolean expresie = (n % 2 == 0);
		return (n & 1) == 0;
	}

	public static void main(String[] args) {
		System.out.println(isEven(7));

		for (int i = 0; i <= 8; i++) {
			System.out.print(i + " ");
			System.out.println(i & 1);
		}
	}
}