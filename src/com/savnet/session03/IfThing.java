package com.savnet.session03;

import java.util.Scanner;

public class IfThing {
	public static void main(String[] args) {
		// afisam un mesaj pe ecran
		System.out.print("Introduceti numele: ");

		// citim numele de la tastatura
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		// iau decizia pe ce ramura merg
		/* cod duplicat */
//		if (name.endsWith("a")) {
//			System.out.println("Ceau, " + name + "!");
//		} else if (name.endsWith("i")) {
//			System.out.println("Ceau, " + name + "!");
//		} else {
//			System.out.println("Salut, " + name);
//		}

		// name.equals("Mircea")
		// solutie pt cod duplicat
		if (!name.equals("Mircea") && name.endsWith("a") || name.endsWith("i")) {
			System.out.println("Ceau, " + name + "!");
		} else {
			System.out.println("Salut, " + name);
		}

		// afisam mesajul Hello... + nume
		// System.out.println("Hello, " + name);

		// "inchidem tastatura"
		scanner.close();
	}
}
