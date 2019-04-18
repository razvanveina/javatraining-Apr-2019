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
}
