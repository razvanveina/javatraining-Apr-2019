package com.savnet.session06;

public class StaticThing {
	public static final int CONSTANTA = 4; // OK
	int variabilaNestatica = 6; // apartine unui obiect
	static int variabilaStatica = 0; // apartine clasei si nu unui obiect anume

	static {
		System.out.println("Cod static");
		System.out.println(variabilaStatica);
	}

	public static void main(String[] args) {
		System.out.println(variabilaStatica);

		// System.out.println(obiect1.variabilaNestatica);

		StaticThing obiect1 = new StaticThing();
		// variabila statica se poate accesa si prin intermediul obiectelor de tipul
		// respectiv
		obiect1.variabilaStatica++;

		StaticThing obiect2 = new StaticThing();
		obiect2.variabilaStatica++;

		StaticThing.variabilaStatica++;

		System.out.println(variabilaStatica);
		// noemi 3 apoi 1
		// simona 0
		// mihai 0 apoi 1
		// andreea 1
		// gabriela 1
		// bianca 3
	}

	// bloc de cod static - se executa la incarcarea clasei
	static {
		System.out.println("Cod static");
		System.out.println(variabilaStatica);
	}

	// bloc de cod nestatic - se executa la crearea unui obiect
	{
		System.out.println("Cod nestatic");
	}
}
