

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두개의 정수를 입력: ");
		int a = scan.nextInt();
		// String s = scan.nextLine(); //버퍼 비우기
		int b = scan.nextInt();
		
		int max=1; //최대공약수, a와 b가 서로소라면 최대공약수는 1
		int i=1; //반복횟수
		int c; //a, b 중 큰 수
		
		if (a>=b)
			c=a;
		else
			c=b;
		
		while (c>=i){
			if (a%i==0 && b%i==0)
				max=i;
			i++;}
		System.out.print("최대 공약수: "+max);
	}
}
