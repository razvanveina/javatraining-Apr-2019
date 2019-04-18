package com.savnet.session04;

public class SwitchThing {
	public static void main(String[] args) {
		int nota = 7;

		switch (nota) {
		case 10:
			System.out.println("Cel mai tare");
			break;
		case 9:
			System.out.println("Aproape perfect");
			break;
		case 8:
			System.out.println("Hai ca mere");
			break;
		default:
			System.out.println("Nota cam mica");
		}

		switch (nota) {
		case 10:
		case 9:
			System.out.println("Cel mai tare");
			break;
		case 8:
		case 7:
			System.out.println("Aproape perfect");
			break;
		case 6:
		case 5:
			System.out.println("Hai ca mere");
			break;
		default:
			System.out.println("Nota cam mica");
		}
	}
}
