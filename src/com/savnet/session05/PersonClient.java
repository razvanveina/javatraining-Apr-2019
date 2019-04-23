package com.savnet.session05;

public class PersonClient {
	public static void main(String[] args) {
		Person naomi = new Person("Naomi", 21);
		// Person naomi = new Person();
		naomi.show();

		Person razvan = new Person("Razvan");
		// Person razvan = new Person();
		razvan.show();

		razvan.setAge(100);
		System.out.println(razvan.getAge());
		// naomi.name = "Naomi"
		// naomi.age = 21
	}
}
