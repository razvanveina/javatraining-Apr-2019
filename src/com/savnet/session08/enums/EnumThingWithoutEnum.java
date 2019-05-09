package com.savnet.session08.enums;

import java.util.Scanner;

public class EnumThingWithoutEnum {
	public static final int LU = 0;
	public static final int MA = 1;
	public static final int MI = 2;
	public static final int JO = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nr = scanner.nextInt();

		showDay(nr);

		scanner.close();

		showDay(LU);
		showDay(MA);
		showDay(MI);
		showDay(10);
	}

	private static void showDay(int nr) {
		switch (nr) {
		case LU:
			System.out.println("Luni");
			break;
		case MA:
			System.out.println("Marti");
			break;
		case MI:
			System.out.println("Miercuri");
			break;
		case JO:
			System.out.println("Joi");
			break;
		}
	}
}
