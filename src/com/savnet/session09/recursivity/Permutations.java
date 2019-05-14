package com.savnet.session09.recursivity;

public class Permutations {
	public static void main(String[] args) {
		showPermutations("", "abc");
	}

	private static void showPermutations(String prefix, String s) {
		if (s.length() == 1) {
			System.out.println(prefix + s);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String before = s.substring(0, i);
			String after = s.substring(i + 1);
			showPermutations("" + prefix + ch, before + after);
		}
	}
}
