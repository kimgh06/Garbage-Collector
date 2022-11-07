package reservation;

import java.util.*;

class Reserve {
	Scanner scan = new Scanner(System.in);
	String a[][] = new String[3][10];

	public Reserve() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = new String("---");
			}
		}
	}

	void classes(int i) {
		switch (i) {
		case 1:
			System.out.print("S>> ");
			return;
		case 2:
			System.out.print("A>> ");
			return;
		case 3:
			System.out.print("B>> ");
			return;
		default:
			System.out.print("E>> ");
			return;
		}
	}

	void seat_reserve() {
		System.out.println("좌석 구분 S : 1, A : 2, B : 3>>");
		int n;
		do {
			n = scan.nextInt();
		} while (n < 0 && n > a.length);

		classes(1);
		for (int i = 0; i < a[n].length; i++) {
			System.out.print(a[n-1][i] + " ");
		}
		System.out.println("이름 : ");
		String name = new String(scan.next());
		System.out.println("번호 : ");
		int number;
		boolean sfalses = false;
		boolean afalses = false;
		do {
			do {
				if (sfalses) {
					System.out.println("범위를 벗어남");
				}
				if (afalses) {
					System.out.println("누군가 먼저 예약함");
				}
				number = scan.nextInt();
				sfalses = true;
				afalses = false;
			} while (0 > number || number > 10);
			sfalses = false;
			afalses = true;
		} while (!a[n - 1][number - 1].equals("---"));
		a[n - 1][number - 1] = new String(name);
	}

	void seat_check() {
		for (int i = 0; i < a.length; i++) {
			classes(i + 1);
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Complete.");
	}

	void seat_cancel() {
		System.out.println("좌석 구분 S : 1, A : 2, B : 3>>");
		int n;
		do {
			n = scan.nextInt();
		} while (n < 0 && n > a.length);
		String name;
		int num = 0;
		boolean fales = false;
		do {
			if(fales) {				
				System.out.println("고장");
			}
			fales = true;
			classes(n);
			for(int i = 0; i < a[n].length;i++) {
				System.out.print(a[n - 1][i] + " ");
			}
			System.out.println("이름 입력");
			name = scan.next();
			System.out.println("번호 입력");
			num = scan.nextInt();
			if(!a[n - 1][num - 1].equals(name)&&!(num < 0 || num>10)) {
				System.out.println("번호를 잘못 입력함.");
				fales = false;
				continue;
			}
		}while(!a[n - 1][num - 1].equals(name));
		a[n-1][num-1]="---";
		seat_check();
	}
}
