package homework;

public class method {
public int asdf(int n) {
	if(n<=0)
		return -n;
	else
		return n;
}
public static void main(String[] args) {
	System.out.println(new method().asdf(6));
}
}
