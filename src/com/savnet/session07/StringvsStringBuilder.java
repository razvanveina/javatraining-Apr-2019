package com.savnet.session07;

public class StringvsStringBuilder {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		stringDemo();
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);

		start = System.currentTimeMillis();
		stringBuilderDemo();
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}

	private static void stringBuilderDemo() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 40000; i++) {
			sb.append(i + ",");
		}
	}

	private static void stringDemo() {
		String s = "";

		for (int i = 0; i < 40000; i++) {
			s += i + ",";
		}

		// System.out.println(s);
	}
}
