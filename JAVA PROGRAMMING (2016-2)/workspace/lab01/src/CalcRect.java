

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("직사각형 가로: ");
		int length = scan.nextInt();
		
		System.out.print("직사각형 세로: ");
		int height = scan.nextInt();
		
		int a = length*height;
		int p = 2*(length+height);
		
		System.out.println("직사각형의 견적: "+a);
		System.out.println("직사각형의 견적: "+p);

	}

}
