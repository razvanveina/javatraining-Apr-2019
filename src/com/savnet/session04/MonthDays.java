package com.savnet.session04;

public class MonthDays {
	public static void main(String[] args) {
		for (int i = 1; i <= 13; i++) {
			System.out.println(i + " : " + getDaysForMonth(i));
		}
	}

	private static int getDaysForMonth(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		default:
			return -1;
		}
	}
}
