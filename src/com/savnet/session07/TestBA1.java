package com.savnet.session07;

public class TestBA1 {
	public static double avg(int[] sir) {
		// aici scriem codul
		double sum = 0;

		for (int x : sir) {
			sum += x;
		}

		return sum / sir.length;
	}

	public static double countElements(int[] sir) {
		int counter = 0;

		for (int x : sir) {
			if (x == 0) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		// aici putem testa codul
		System.out.println(avg(new int[] { 1, 2, 3 }));
	}
}