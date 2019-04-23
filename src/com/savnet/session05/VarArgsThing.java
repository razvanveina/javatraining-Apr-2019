package com.savnet.session05;

public class VarArgsThing {
	public static void main(String[] args) {
		metoda(1);
		metoda(1, 2);
		metoda(5, 8, 6, 5);
		metoda();
	}

	public static void metoda(int... params) {
		for (int x : params) {
			System.out.print(x);
		}
		System.out.println();
	}
}
