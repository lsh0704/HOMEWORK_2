import java.util.Scanner;

class BankAccount{
	private int balance;
	
	public void withdraw(int output){ //���� ����
		if (output > 0){
			if (getBalance() >= output)
				balance=getBalance()-output;
			else
				System.out.println("����! �ܾ� ����");}
		else
			System.out.println("���� �ݾ��� �߸��Է��ϼ̽��ϴ�.");		
	}
	
	public void deposit(int input){ //����
		if (input > 0){
			balance=getBalance()+input;
		}
		else
			System.out.println("���� �ݾ��� �߸��Է��ϼ̽��ϴ�.");
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