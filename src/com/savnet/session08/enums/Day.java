package com.savnet.session08.enums;

public enum Day {

	// echivaluent cu public static final Day LU;
	LU("Luni", 1), MA("Marti", 2), MI("Miercuri", 3), JO("Joi", 4);

	private String text;
	private int nr;

	Day(String text, int nr) {
		this.text = text;
		this.nr = nr;
	}

	public String getText() {
		return text;
	}

	public static Day extractDayFromNumber(int nr) {
		Day[] values = Day.values();

		for (Day day : values) {
			if (day.getNr() == nr) {
				return day;
			}
		}

		return null;
	}

	public int getNr() {
		return nr;
	}

}
