

import java.util.Scanner;

public class MoneyTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �ݾ� �Է�: ");
		int amount = scan.nextInt();
		
		int count = amount/50000;
		amount = amount%50000;
		System.out.println("50,000����  "+count+"��");
		
		count = amount/10000;
		amount=amount%10000;
		System.out.println("10,000���� "+count+"��");
		
		count = amount/5000;
		amount=amount%5000;
		System.out.println("5,000���� "+count+"��");
		
		count = amount/1000;
		amount=amount%1000;
		System.out.println("1,000���� "+count+"��");
		
		count = amount/500;
		amount=amount%500;
		System.out.println("500���� "+count+"��");
		
		count=amount/100;
		amount=amount%100;
		System.out.println("100���� "+count+"��");
		
		count=amount/50;
		amount=amount%50;
		System.out.println("50���� "+count+"��");
		
		
		count=amount/10;
		System.out.println("10���� "+count+"��");				
	}
}
