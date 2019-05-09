package com.savnet.session08.enums;

import java.util.Scanner;

public class EnumThingWithEnum4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		// Day[] values = Day.values();
		Day day = Day.valueOf(s);

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
