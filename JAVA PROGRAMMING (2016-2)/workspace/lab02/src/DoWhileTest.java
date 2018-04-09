

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("1. 분식");
		System.out.println("2. 한식");
		System.out.println("3. 양식");
		System.out.println("4. 중식");
		System.out.print("메뉴입력: ");
		int n = scan.nextInt();
		
		switch(n){
		case 1:
			System.out.println("1-1. 떡볶이");
			System.out.println("1-2. 순대");
			System.out.println("1-3. 튀김");
			break;
		case 2:
			System.out.println("2-1. 비빔밥");
			System.out.println("2-2. 불고기");
			System.out.println("2-3. 국밥");
			break;
		case 3:
			System.out.println("3-1. 스테이크");
			System.out.println("3-2. 파스타");
			System.out.println("3-3. 브런치");
			break;
		case 4:
			System.out.println("4-1. 짜장면");
			System.out.println("4-2. 탕수육");
			System.out.println("4-3. 짬뽕");
		default:
			break;}
		
		if (n==1 || n==2 || n==3 || n==4)
			break; //메뉴 1~4 누른경우 세부메뉴만 출력하고 종료
		}while(1<2);
	}
}
