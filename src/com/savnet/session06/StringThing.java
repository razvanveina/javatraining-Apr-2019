package com.savnet.session06;

/*
 * TEMA DE CASA
 * 
 * Sa se implementeze o metoda care construieste un String de forma:
 * "0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15..............999,1000"
 * 
 * plus
 * 
 * problemele BA1 - BA10 de pe site OBLIGATORIU
 * 
 * 
 */
public class StringThing {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = new String("123");
		String s3 = "123";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		boolean b = false;
		if (b = true) {
			System.out.println("do something");
		}

		String s = "1";
		s += "23";
		System.out.println(s == s1);

		s = "abcdef";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.length());

		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(3));

		System.out.println(s.indexOf("cd"));
		System.out.println(s.indexOf("cda"));
		System.out.println("abcdef".indexOf('a'));

		System.out.println("".length());
		System.out.println("".isEmpty());
		System.out.println("  123  ".trim());
		System.out.println("  1 2 3  ".trim());

		// compararea valorilor a doua String-uri se face intotdeauna cu equals()
		System.out.println("value".equals(new String("value")));
		System.out.println("value".equals(new String("value1")));
		System.out.println("Value".equals(new String("value")));

		System.out.println("Value".equalsIgnoreCase("value"));

		System.out.println("abcdef".replaceAll("a", "A"));

		String sx = "abcdef";
		sx.replaceAll("a", "A");
		System.out.println(sx);

		char[] charArray = "qwe".toCharArray();
		for (char ch : charArray) {
			System.out.println(ch);
		}

		System.out.println("noemi".compareTo("bianca"));
		System.out.println("andreea".compareTo("bianca"));
		System.out.println("andreea".compareTo("andreea"));

		System.out.println("A".compareToIgnoreCase("a"));
		System.out.println("A".compareTo("a"));

		System.out.println("abcdef".endsWith("ef"));
		System.out.println("abcdef".endsWith("" + 'f'));
		System.out.println("abcdef".startsWith("abc"));

		System.out.println("abcabcabc".indexOf("abc", 1));
		System.out.println("abcabcabc".lastIndexOf("abc"));

		String[] splits = "1233 3236 1237 1239".split(" ");
		for (String s7 : splits) {
			System.out.println(s7);
		}

		String[] splits2 = "1233,3236,1237 1239".split("[ ,]");
		for (String s7 : splits2) {
			System.out.println(s7);
		}

		System.out.println(countApp("abcabcabc", "ab"));
	}

	private static int countApp(String s, String ss) {
		int counter = 0;
		int lastPosition = 0;

		while (true) {
			int position = s.indexOf(ss, lastPosition);
			if (position == -1) {
				break;
			}
			counter++;
			lastPosition = position + 1;
		}
		return counter;
	}
}
