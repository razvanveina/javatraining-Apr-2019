package com.savnet.session04;

public class ForEach {
	public static void main(String[] args) {
		int[] array = { 7, 3, 9, 5, 2, 8, 10 };

		// se foloseste atunci cand avem nevoie de index(i) in interiorul for-ului
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// for-each - se foloseste in toate cazurile in care e posibil (cand iteram pe
		// un array)
		for (int element : array) {
			System.out.println(element);
		}

		int[] arr = { 27, 39, 22, 28, 18, 21, 24, 23, 22 };

		System.out.println(average(arr));

		System.out.println(min(arr));

	}

	private static int min(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	private static double average(int[] arr) {
		int sum = 0;

		for (int element : arr) {
			sum += element;
		}

		double avg = (double) sum / arr.length;
		return avg;
	}
}
