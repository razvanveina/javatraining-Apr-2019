package com.savnet.session02;

public class VariablesThing {
	static final int NUMAR_ZILE_SAPTAMANA = 7; // code convention pentru constante

	int variabilaMembru; // o variabila membru se declara in clasa
	// si apartine unei instante a unei clase

	static int variabilaMembruStatica; // o variabila membru statica
	// se declara in clasa si apartine clasei

	/*
	 * Si parametrii sunt variabile locale
	 */
	public static void main(String[] args) {
		int nr; // declararea variabilei locala nr de tip int
		nr = 7; // initializarea variabilei
		System.out.println(nr); // i se afiseaza valoarea

		int nr2 = 7; // declarare plus initializare (recomandat)
		int numeVariabila = 0; // code convention

		metoda(10);

		// NUMAR_ZILE_SAPTAMANA = 6;
		// o variabila final nu poate fi modificata ulterior
	}

	private static void metoda(int parametru) {
		int nr = 5;
		System.out.println(parametru);
		System.out.println(nr);
	}
}
