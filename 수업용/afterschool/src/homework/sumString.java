package homework;

public class sumString {
public static void main(String[] args) {
	String a = "12345";
	int sum = 0;
	for(int i = 0; i< a.length(); i++) {
		sum += a.charAt(i) - '0';
	}
	System.out.println(sum);
}
}
