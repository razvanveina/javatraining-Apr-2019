package com.savnet.session04.student;

public class StudentClient {
	public static void main(String[] args) {
		Student nicu; // declararea variabilei
		nicu = new Student(); // initializarea (crearea obiectului)
		nicu.nume = new String("Nicu");
		nicu.varsta = 25;
		nicu.media = 9.75;

		Student bianca = new Student();
		bianca.nume = "Bianca";
		bianca.varsta = 22;
		bianca.media = 9.75;
		bianca.sef = nicu;

		nicu.show();
		bianca.show();

		// nicu = bianca;
		bianca.varsta = 18;

		nicu.show();

		Student[] students = { nicu, bianca };

		Student sef = gasesteSeful(students);
		sef.show();

	}

	private static Student gasesteSeful(Student[] students) {
		for (Student stud : students) {
			if (stud.sef == null) {
				return stud;
			}
		}
		return null;
	}
}
