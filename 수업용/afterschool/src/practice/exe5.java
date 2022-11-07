package practice;

public class exe5 {
	public static void main(String[] args) {
		studenta s = new studenta("hong", 1,1,100,60,76);
		System.out.println(s.info());
	}
}

class studenta{
	String name;
	int clas;
	int no;
	int kor;
	int eng;
	int math;
	public studenta(String name, int clas, int no, int kor, int eng, int math) {
		this.name = name;
		this.clas = clas;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info() {
		return (name +","+ clas+"," + no +","+ kor+","+ eng+","+ math);
	}
}