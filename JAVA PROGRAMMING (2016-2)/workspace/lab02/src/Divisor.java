

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է�: ");
		int d = scan.nextInt();
		
		System.out.println(d+"�� ����� ������ �����ϴ�.");
		
		for (int i=1; i<=d; i++){
			if (d%i==0)
				System.out.print(i+" ");
		}
	}

}
