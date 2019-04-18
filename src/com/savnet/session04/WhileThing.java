package com.savnet.session04;

public class WhileThing {
	public static void main(String[] args) {
		// while
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// do while
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		// bucla infinita
//		while (true) {
//
//		}

		i = 1;
		while (true) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}

		i = 0;
		while (i <= 10) { // 1
			i++;
			if (i == 5) {
				continue;
				// 3
			}
			System.out.println(i);
		}
		// 2

		label: for (int j = 0; j < 3; j++) { // valabil si pt while
			for (int k = 0; k < 3; k++) {
				System.out.println(j + " " + k);

				if (k == 1) {
					break label; // valabil si pentru continue
				}
			}
		}
	}
}
