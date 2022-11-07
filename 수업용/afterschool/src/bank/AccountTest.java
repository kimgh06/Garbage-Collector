package bank;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account("123456-123456", "1234", "홍길동", 10000);
		Account a2 = new Account("123456-789456", "0000", "둘리", 20000);
		a2.setAcocuntNumber("789456-789456");
		System.out.println(a1.getAccountInfo());
		System.out.println(a2.getAccountInfo());
		
		a1.deposit(1000);
		a2.deposit(2000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		a1.withdraw(20000);
		a2.withdraw(5000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		System.out.println("비번 두번 입력");
		if(sc.nextLine().equals(sc.nextLine())) {
			System.out.println("비번 재설정");
			a1.setPassword(sc.next());
			System.out.println(a1.getPassword());			
		}
		else
			System.out.println("다름");
	}
}
