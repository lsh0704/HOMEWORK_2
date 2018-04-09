

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.print("키(미터 단위): ");
		double height = scan.nextDouble();
		
		System.out.print("체중: ");
		double weight = scan.nextDouble();
		
		double bmi = weight/(height*height);
		
		
		if (bmi>=30)
			result = "비만";
		else if (bmi>=25)
			result = "과체중";
		else
			result = "정상";
		
		System.out.println("BMI: "+bmi);
		System.out.println("결과: "+result);
	}
}
