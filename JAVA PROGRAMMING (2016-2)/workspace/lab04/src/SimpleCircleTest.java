import java.util.Scanner;

class SimpleCircle{
		int radius;
		static final double PI = 3.14159;}

public class SimpleCircleTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		SimpleCircle circle = new SimpleCircle();
		double area;
		
		System.out.print("Enter the radius: ");
		circle.radius = scan.nextInt(); //반지름 입력
		
		area = circle.radius * circle.radius * circle.PI;
		
		System.out.println("Area of circle :" + area);
	}
}

