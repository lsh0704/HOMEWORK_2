

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է�: ");
		int a = scan.nextInt();
		// String s = scan.nextLine(); //���� ����
		int b = scan.nextInt();
		
		int max=1; //�ִ�����, a�� b�� ���μҶ�� �ִ������� 1
		int i=1; //�ݺ�Ƚ��
		int c; //a, b �� ū ��
		
		if (a>=b)
			c=a;
		else
			c=b;
		
		while (c>=i){
			if (a%i==0 && b%i==0)
				max=i;
			i++;}
		System.out.print("�ִ� �����: "+max);
	}
}
