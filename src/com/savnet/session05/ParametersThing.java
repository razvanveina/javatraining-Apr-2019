package com.savnet.session05;

public class ParametersThing {
	public static void main(String[] args) {
		int x = 7;

		metoda(x);

		System.out.println(x);
	}

	public static void metoda(/* final */ int z) {
		z = 10;
	}
}
