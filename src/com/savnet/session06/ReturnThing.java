package com.savnet.session06;

public class ReturnThing {
	public static void main(String[] args) {
		int[] array = { 6, 3, 7, 8, 9 };
		search(array, 7);
	}

	// asa da
	private static boolean search(int[] array, int n) {
		for (int element : array) {
			if (element == n) {
				return true;
			}
		}
		return false;
	}

	// asa nu !!!
	private static boolean search2(int[] array, int n) {
		boolean gasit = false;

		for (int element : array) {
			if (element == n) {
				gasit = true;
			}
		}

		return gasit;
	}
}
