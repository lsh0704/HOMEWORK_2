

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�µ� �Է�: "); //�µ����� ȭ��
		int temp = scan.nextInt();
		
		System.out.print("��õ �: ");
		
		if (temp < 40 && temp>=20)
			System.out.print("��Ű");
		else if (temp < 60 && temp>=40)
			System.out.print("����");
		else if (temp < 80 && temp>=60)
			System.out.print("�״Ͻ�");
		else if (temp>=80 && temp<=95 )
			System.out.print("����");
		else
			System.out.print("�ش��׸� ����");
		}
	}

