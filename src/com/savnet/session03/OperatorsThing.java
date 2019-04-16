package com.savnet.session03;

public class OperatorsThing {
	public static void main(String[] args) {
		int x = 0;
		x++; // x = x + 1
		System.out.println(x);

		System.out.println(x++); // post incrementare
		System.out.println(++x); // pre incrementare

		System.out.println(-x);

		boolean b = true;
		System.out.println(!b);

		System.out.println(~5);

		System.out.println(5 + 7);
		System.out.println(x + 7);

		System.out.println(5 * (7 + 3) / 9);

		System.out.println(16 << 1);
		System.out.println(16 << 2);

		System.out.println(16 >> 1);
		System.out.println(16 >> 2);

		System.out.println(16 >>> 1);
		System.out.println(-16 >>> 1);

		System.out.println(7 > 3);
		System.out.println(7 != 3);
		System.out.println(7 == 3);

		int y = 3;
		System.out.println(y == 3); // true
		System.out.println(y = 3); // 3
		System.out.println(y == 4); // false
		System.out.println(y = 4); // 4
		System.out.println(y);

		System.out.println(10 & 15);
		System.out.println(10 | 15);

		int a = 0;
		System.out.println(a > 4 && a < 10); // operatori logici

		System.out.println(a > 4 && aMaiMicDecat10(a)); // operator de scurtcircuitare

		a = 10;
		a += 10; // a = a + 10

		System.out.println(10 % 3);
		System.out.println(49 % 10); // modulo (restul impartirii)

		int nota = 10;
		System.out.println((nota >= 9 && nota <= 10) ? "bine" : //
				(nota >= 7 && nota <= 8) ? "satisfacator" : "...");

		String s = "abc" + "def";
		System.out.println(s);

	}

	private static boolean aMaiMicDecat10(int a) {
		System.out.println("Am intrat prin metoda");
		return a < 10;
	}
}
