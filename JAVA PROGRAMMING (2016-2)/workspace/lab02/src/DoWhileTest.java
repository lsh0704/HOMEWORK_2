

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("1. �н�");
		System.out.println("2. �ѽ�");
		System.out.println("3. ���");
		System.out.println("4. �߽�");
		System.out.print("�޴��Է�: ");
		int n = scan.nextInt();
		
		switch(n){
		case 1:
			System.out.println("1-1. ������");
			System.out.println("1-2. ����");
			System.out.println("1-3. Ƣ��");
			break;
		case 2:
			System.out.println("2-1. �����");
			System.out.println("2-2. �Ұ��");
			System.out.println("2-3. ����");
			break;
		case 3:
			System.out.println("3-1. ������ũ");
			System.out.println("3-2. �Ľ�Ÿ");
			System.out.println("3-3. �귱ġ");
			break;
		case 4:
			System.out.println("4-1. ¥���");
			System.out.println("4-2. ������");
			System.out.println("4-3. «��");
		default:
			break;}
		
		if (n==1 || n==2 || n==3 || n==4)
			break; //�޴� 1~4 ������� ���θ޴��� ����ϰ� ����
		}while(1<2);
	}
}
