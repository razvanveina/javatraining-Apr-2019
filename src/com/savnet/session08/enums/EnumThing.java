package com.savnet.session08.enums;

public class EnumThing {
	public static void main(String[] args) {
		System.out.println(Day.LU.compareTo(Day.MA));
		System.out.println(Day.MA.compareTo(Day.LU));
		System.out.println(Day.LU.compareTo(Day.LU));

		System.out.println(Day.LU.equals(Day.LU));
		System.out.println(Day.LU.equals(Day.MA));

		Day day = Day.LU;
		System.out.println(day.name());

		System.out.println(Day.LU.ordinal());
		System.out.println(Day.MA.ordinal());
	}

}