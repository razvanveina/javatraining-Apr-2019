package com.savnet.session04.student;

public class Student {
	// specificatorii de acces pentru variabilele membru ar trebui sa fie
	// intotdeauna private
	public String nume;
	public int varsta;
	public double media;
	public Student sef;

	public void show() {
		System.out.println(nume + " " + varsta + " " + media);
	}

	public void show(String message) {
		System.out.println(message);
		System.out.println(nume + " " + varsta + " " + media);
	}

	public void show(int nr) {
		System.out.println(nr);
		System.out.println(nume + " " + varsta + " " + media);
	}

//	public int show(int nr) {
//		System.out.println(nr);
//		System.out.println(nume + " " + varsta + " " + media);
//	}
}
