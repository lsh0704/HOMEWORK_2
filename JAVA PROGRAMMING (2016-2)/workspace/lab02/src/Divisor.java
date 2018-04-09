

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력: ");
		int d = scan.nextInt();
		
		System.out.println(d+"의 약수는 다음과 같습니다.");
		
		for (int i=1; i<=d; i++){
			if (d%i==0)
				System.out.print(i+" ");
		}
	}

}
