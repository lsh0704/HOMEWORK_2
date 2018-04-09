import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();

		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.println("");
		System.out.print("결과>> ");		
		int avg=(kor+eng+math)/3;//average 구하기
		
		if (kor < 40 || eng < 40 || math < 40)
			System.out.print("과락");
		else{
			if (avg <60)
				System.out.print("불합격");
			else
				System.out.print("합격");
		}
	}

}
