package homework;

public class sumeveryone {
public static void main(String[] args) {
	int sum = 0;
	for(int i = 1; i< 11; i++) {
		for(int j = 0; j<i;j++) {
			sum+=j + 1;
		}
	}
	System.out.println(sum);
}
}
