package homework;

import java.util.Scanner;

public class random {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int com = (int)(Math.random() * 10) + 1;
	int cnt = 0;
	int n;
	do {
		cnt++;
		n = sc.nextInt();
		if (n>com)
			System.out.println("큼");
		else if(n<com)
			System.out.println("작음");
	}while(n != com);
	System.out.println(cnt);
}
}
