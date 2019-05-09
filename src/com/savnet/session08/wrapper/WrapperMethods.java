package com.savnet.session08.wrapper;

public class WrapperMethods {
	public static void main(String[] args) {
		String s = "123,234,345";
		String[] splits = s.split(",");
		int sum = 0;
		for (String ss : splits) {
			sum += Integer.parseInt(ss);
		}
		System.out.println(sum);

		int x = Integer.parseInt("123");
		System.out.println(x);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(Integer.max(5, 7));

		System.out.println(Integer.signum(-5));
		System.out.println(Integer.signum(5));

		System.out.println(Integer.toBinaryString(10));

		System.out.println(Character.isDigit('a'));
	}
}
