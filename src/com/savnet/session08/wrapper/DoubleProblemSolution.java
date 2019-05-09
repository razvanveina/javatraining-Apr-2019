package com.savnet.session08.wrapper;

import java.math.BigDecimal;

public class DoubleProblemSolution {
	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal("0.0");

		for (int i = 0; i < 10; i++) {
			System.out.println(bigDecimal);
			bigDecimal = bigDecimal.add(new BigDecimal("0.1"));
		}

		System.out.println(bigDecimal);

	}
}
