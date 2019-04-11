package com.savnet.session02;

public class PrimitivesThing {
	public static void main(String[] args) {
		int x = 10;
		byte b = 12;
		byte b2 = (byte) 200;
		System.out.println(b2);

		double d = 3.14;
		System.out.println(d);

		int dd = (int) d;
		System.out.println(dd);

		double d2 = 3.94;
		System.out.println(d2);

		int dd2 = (int) d2;
		System.out.println(dd2);

		char ch = '0';
		int ch2 = ch;
		System.out.println(ch2);

		boolean bool = true;

		String s = "abc";
		System.out.println(s + "def");

		long x2 = 100_000_000_000_000L; // literal de tip long

		float f = 3.1415F; // literal de tip float

		int nrZecimal = 12312312;
		int nrBinar = 0b00111111;
		System.out.println(nrBinar);
		int nrHexa = 0xFF;

		// caractere speciale
		System.out.println('\"');
		System.out.println('\'');
		System.out.println('\\');
		System.out.println(' ');
		System.out.println('\u1234');

	}
}
