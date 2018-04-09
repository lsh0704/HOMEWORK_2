

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name=scan.next();
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.println(name+"님의 총점: "+(kor+eng+math));
		
		System.out.println(name+"님의 평균: "+((kor+eng+math)/3));
	}
}
