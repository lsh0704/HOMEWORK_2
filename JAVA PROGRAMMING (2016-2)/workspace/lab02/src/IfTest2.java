

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("온도 입력: "); //온도값은 화씨
		int temp = scan.nextInt();
		
		System.out.print("추천 운동: ");
		
		if (temp < 40 && temp>=20)
			System.out.print("스키");
		else if (temp < 60 && temp>=40)
			System.out.print("골프");
		else if (temp < 80 && temp>=60)
			System.out.print("테니스");
		else if (temp>=80 && temp<=95 )
			System.out.print("수영");
		else
			System.out.print("해당항목 없음");
		}
	}

