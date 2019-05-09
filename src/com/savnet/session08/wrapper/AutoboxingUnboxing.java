package com.savnet.session08.wrapper;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		Integer x = 5; // autoboxing (Integer x = new Integer(5);)
		int y = x; // unboxing (y = x.intValue();)

		apelMetoda(y);
	}

	private static void apelMetoda(Integer y) {
		// autoboxing
	}
}
