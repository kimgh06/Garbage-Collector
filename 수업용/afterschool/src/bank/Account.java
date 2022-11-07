package bank;

public class Account {
	private String acocuntNumber;
	private String password;
	private String name;
	private int balance;
	public Account() {
		
	}
	public Account(String acocuntNumber, String password, String name, int balance) {
		this.acocuntNumber = acocuntNumber;
		this.password = password;
		this.name = name;
		this.balance = balance;
	}
	public String getAcocuntNumber() {
		return acocuntNumber;
	}
	public void setAcocuntNumber(String acocuntNumber) {
		this.acocuntNumber = acocuntNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int money) {
		if (money< 0)
			System.out.println("금액을 정확히 입력하세요");
		else
			this.balance+=money;
	}
	
	void withdraw(int money) {
		if(money > this.balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else if(money <= 0) {
			System.out.println("0원 이하의 단위로는 출금 불능합니다.");
		}
		else 
			this.balance -=money;
	}
	
	String getAccountInfo() {
		return ("계좌번호 : "+this.acocuntNumber+", 예금주명 : "+this.name+", 비밀번호 : "+this.password+", 잔액 : "+this.balance);
	}	
}
