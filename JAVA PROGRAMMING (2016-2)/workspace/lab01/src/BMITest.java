

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű(���� ����): ");
		double height = scan.nextDouble();
		
		System.out.print("ü��: ");
		double weight = scan.nextDouble();
		
		double bmi = weight/(height*height);
		
		
		if (bmi>=30)
			result = "��";
		else if (bmi>=25)
			result = "��ü��";
		else
			result = "����";
		
		System.out.println("BMI: "+bmi);
		System.out.println("���: "+result);
	}
}
