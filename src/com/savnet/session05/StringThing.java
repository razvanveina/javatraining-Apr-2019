package com.savnet.session05;

public class StringThing {
	public static void main(String[] args) {
		String s = "Noemi";
		for (char ch : s.toCharArray()) {
			System.out.println(ch);
		}

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		s = "324123yt1tuu3432";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				result += ch;
			}
		}

		System.out.println(result);
	}
}
