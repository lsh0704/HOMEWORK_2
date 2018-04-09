

import java.util.Scanner;

public class MoneyTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("지불할 금액 입력: ");
		int amount = scan.nextInt();
		
		int count = amount/50000;
		amount = amount%50000;
		System.out.println("50,000원권  "+count+"장");
		
		count = amount/10000;
		amount=amount%10000;
		System.out.println("10,000원권 "+count+"장");
		
		count = amount/5000;
		amount=amount%5000;
		System.out.println("5,000원권 "+count+"장");
		
		count = amount/1000;
		amount=amount%1000;
		System.out.println("1,000원권 "+count+"장");
		
		count = amount/500;
		amount=amount%500;
		System.out.println("500원권 "+count+"개");
		
		count=amount/100;
		amount=amount%100;
		System.out.println("100원권 "+count+"개");
		
		count=amount/50;
		amount=amount%50;
		System.out.println("50원권 "+count+"개");
		
		
		count=amount/10;
		System.out.println("10원권 "+count+"개");				
	}
}
