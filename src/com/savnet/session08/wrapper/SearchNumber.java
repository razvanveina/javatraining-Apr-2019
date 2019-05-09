package com.savnet.session08.wrapper;

public class SearchNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 44, 6, 7, 8 };
		System.out.println(search(arr, 6));
		System.out.println(search(arr, 11));

		int[] arr2 = { -1, 3, 44, 6, 7, 8 };
		Integer result = search2(arr2, 6);
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("Nr negasit");
		}
	}

	private static int search(int[] arr, int nr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == nr) {
				return i;
			}
		}

		return -1;
	}

	private static Integer search2(int[] arr, int nr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == nr) {
				return i;
			}
		}

		return null;
	}
}
