package com.savnet.session06;

import com.savnet.session05.Value;

public class ParametersThing4 {
	public static void main(String[] args) {
		Value x = new Value(7);

		x = metoda(x);

		System.out.println(x.getNr());
	}

	public static Value metoda(final Value z) {
		return new Value(10);
	}
}
