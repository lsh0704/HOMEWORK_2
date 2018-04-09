import java.util.Scanner;

class BankAccount{
	private int balance;
	
	public void withdraw(int output){ //예금 인출
		if (output > 0){
			if (getBalance() >= output)
				balance=getBalance()-output;
			else
				System.out.println("에러! 잔액 부족");}
		else
			System.out.println("인출 금액을 잘못입력하셨습니다.");		
	}
	
	public void deposit(int input){ //예입
		if (input > 0){
			balance=getBalance()+input;
		}
		else
			System.out.println("예입 금액을 잘못입력하셨습니다.");
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void printBalance(){
		System.out.println(getBalance());
	}
	public double addInterest(){
		balance=(int)(getBalance()*1.075);
		return getBalance();
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.setBalance(100);
		a2.setBalance(50);
		
		a1.withdraw(60);
		a1.withdraw(50);
		a2.withdraw(30);
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance();
		a2.printBalance();
	}
}