package com.savnet.session03;

public class ForThing {
	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);

		// secventa de initializare; secventa de terminare (boolean); secventa de
		// incrementare
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// for (;;) {
		// bucla infinita
		// }

		for (int i = 0, j = 0; i <= 10; i++, j += 2) {
			System.out.println(i + " " + j);
		}

		System.out.println("Am terminat forul");
		//

	}
}
