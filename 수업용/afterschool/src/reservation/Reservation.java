package reservation;

import java.util.*;

public class Reservation {
	public static int verifyInt() {
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			try {
				choice = sc.nextInt();
				return choice;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				sc.next();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reserve re = new Reserve();
		int number;
		while (true) {
			System.out.println("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
			number = verifyInt();
			switch (number) {
			case 1:
				re.seat_reserve();
				break;

			case 2:
				re.seat_check();
				break;

			case 3:
				re.seat_cancel();
				break;

			case 4:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 입력!");
				continue;
			}
		}
	}
}
