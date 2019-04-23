package com.savnet.session05;

public class ParametersThing3 {
	public static void main(String[] args) {
		Value x = new Value(7);

		metoda(x);

		System.out.println(x.getNr());
	}

	public static void metoda(final Value z) {
		z.setNr(10);
	}
}
