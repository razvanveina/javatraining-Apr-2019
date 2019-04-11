package com.savnet.session02;

import java.util.Arrays;

public class ArraysThing {
	public static void main(String[] args) {
		int[] array; // declararea variabilei de tip array de int
		array = new int[5]; // initializarea variabilei de tip array de int

		int[] array2 = new int[5]; // recomandat

		array[2] = 5;
		System.out.println(array[2]);

		System.out.println(Arrays.toString(array)); // afisarea unui array

		System.out.println(array.length); // lungimea array-ului

		int[] array3 = { 1, 2, 3, 4, 5 }; // initializare array mai speciala
		System.out.println(Arrays.toString(array3));

		boolean[] arrayDeBoolean = { true, false };

		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6 }, //
				{ 7, 8, 9 } //
		};

		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][0]);
		System.out.println(matrix[2][2]);

		// System.out.println(array3[5]);

		int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //
		int[] array5 = new int[3]; // 2,3,4
		System.arraycopy(array4, 1, array5, 0, 3);
		System.out.println(Arrays.toString(array5));

		method(array4);
		method(array3);

		System.out.println("Cu Arrays.copyOfRange");
		int[] result = Arrays.copyOfRange(array4, 1, 8);
		System.out.println(Arrays.toString(result));

		int[] arrayNesortat = { 8, 8, 54, 9, 5, 3, 4, 7, 9, 0, 55, 5 };

		Arrays.sort(arrayNesortat);

		System.out.println(Arrays.toString(arrayNesortat));

		Arrays.fill(arrayNesortat, 0);

		System.out.println(Arrays.toString(arrayNesortat));

	}

	private static void method(int[] array) {
		// afiseaza toate elementele din array mai putin primul si ultimul
		// folosind metoda System.arraycopy
		int[] array5 = new int[array.length - 2];
		System.arraycopy(array, 1, array5, 0, array5.length);
		System.out.println(Arrays.toString(array5));
	}
}
