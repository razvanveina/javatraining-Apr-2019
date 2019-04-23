package com.savnet.session05;

public class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person[] array = { //
				new Person("Ion", 30), //
				new Person("Gheo", 20), //
				new Person("Mircea", 25) };

		int sum = 0;

//		for (int i = 0; i < array.length; i++) {
//			sum += array[i].getAge();
//		}

		for (Person p : array) {
			sum += p.getAge();
		}

		System.out.println(sum / array.length);
	}

}
