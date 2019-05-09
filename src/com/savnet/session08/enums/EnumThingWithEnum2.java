package com.savnet.session08.enums;

import java.util.Scanner;

public class EnumThingWithEnum2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nr = scanner.nextInt();

		Day[] values = Day.values();
		Day day = values[nr];

		showDay(day);

		scanner.close();

//		showDay(Day.LU);
//		showDay(Day.MA);
//		showDay(Day.MI);
		// showDay(10);
	}

	private static void showDay(Day day) {
		System.out.println(day.getText());
	}
}
