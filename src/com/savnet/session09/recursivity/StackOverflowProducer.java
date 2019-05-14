package com.savnet.session09.recursivity;

public class StackOverflowProducer {
	static int counter = 0;

	public static void main(String[] args) {
		metoda();
	}

	private static void metoda() {
		counter++;
		System.out.println(counter);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		metoda();
	}
}
