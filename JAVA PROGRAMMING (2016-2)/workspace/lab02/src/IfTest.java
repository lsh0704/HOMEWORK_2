import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int kor = scan.nextInt();
		
		System.out.print("����: ");
		int eng = scan.nextInt();

		System.out.print("����: ");
		int math = scan.nextInt();
		
		System.out.println("");
		System.out.print("���>> ");		
		int avg=(kor+eng+math)/3;//average ���ϱ�
		
		if (kor < 40 || eng < 40 || math < 40)
			System.out.print("����");
		else{
			if (avg <60)
				System.out.print("���հ�");
			else
				System.out.print("�հ�");
		}
	}

}
