

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String name=scan.next();
		
		System.out.print("����: ");
		int kor = scan.nextInt();
		
		System.out.print("����: ");
		int eng = scan.nextInt();
		
		System.out.print("����: ");
		int math = scan.nextInt();
		
		System.out.println(name+"���� ����: "+(kor+eng+math));
		
		System.out.println(name+"���� ���: "+((kor+eng+math)/3));
	}
}
