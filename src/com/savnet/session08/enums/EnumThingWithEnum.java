package com.savnet.session08.enums;

import java.util.Scanner;

public class EnumThingWithEnum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nr = scanner.nextInt();

		Day[] values = Day.values();
		Day day = values[nr];

		showDay(day);

		scanner.close();

		showDay(Day.LU);
		showDay(Day.MA);
		showDay(Day.MI);
		// showDay(10);
	}

	private static void showDay(Day day) {
		switch (day) {
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
