package com.savnet.session01;

import java.util.Scanner;

public class HelloUser {
	public static void main(String[] args) {
		// afisam un mesaj pe ecran
		System.out.print("Introduceti numele: ");

		// citim numele de la tastatura
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		// afisam mesajul Hello... + nume
		System.out.println("Hello, " + name);

		// "inchidem tastatura"
		scanner.close();
	}
}
