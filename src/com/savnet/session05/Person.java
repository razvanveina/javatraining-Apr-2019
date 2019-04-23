package com.savnet.session05;

/*
 * Sa se creeze un array cu 3 obiecte Person si sa se calculeze si 
 * afiseze media varstelor acestora
 */
public class Person {
	private String name;
	private int age;

	public Person(String name) {
		this(name, -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(this.name + " " + this.age);
		// System.out.println(name + " " + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
