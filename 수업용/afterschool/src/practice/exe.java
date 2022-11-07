package practice;

class exe{
	public static void main(String[] args) {
		student s = new student();
		s.name = "mr.hong";
		s.clas = 1;
		s.no=1;
		s.kor=100;
		s.eng = 60;
		s.math = 76;
		System.out.println(s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
	}
}

class student {
	String name;
	int clas;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() {
		return (kor + eng + math);
	}
	double getAverage() {
		return (kor + eng + math)/3;
	}
}
