

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���簢�� ����: ");
		int length = scan.nextInt();
		
		System.out.print("���簢�� ����: ");
		int height = scan.nextInt();
		
		int a = length*height;
		int p = 2*(length+height);
		
		System.out.println("���簢���� ����: "+a);
		System.out.println("���簢���� ����: "+p);

	}

}
