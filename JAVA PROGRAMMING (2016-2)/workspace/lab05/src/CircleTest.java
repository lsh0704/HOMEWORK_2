import java.util.Scanner;

class Circle{
	private double radius;
	static double PI = 3.141592; //PI라는 이름으로 3.141592로 초기화된 정적 상수 정의
	
	public Circle(double rad){ //매개변수로 원의 반지름을 받는 생성자 작성
		radius = rad;
		}	
	public Circle(){ //매개변수가 없는 생성자로서 원의 반지름을 0.0으로 설정
		radius = 0.0;		
		}
	
	public void setRadius(double radius) { //설정자 메소드인 setRadius()를 작성
		this.radius = radius;
		}
	public double getRadius() { //접근자 메소드인 getRadius()를 작성
		return radius;
		}

	public double square(){ //double형의 값을 제곱하여 반환하는 square() 메소드를 작성(전용 메소드)
		return getRadius() *getRadius();
		}
	
	public double getArea(){ //원의 면적을 계산하는 getArea() 메소드를 작성, 이 때 square() 메소드 사용
		return PI*square();
		}
	public double getPerimeter(){ //원의 둘레를 계산하는 getPerimeter 메소드 작성
		return 2*PI*getRadius();
		}

	public static double getPI() { //PI 값을 반환하는 정적 메소드 getPI() 메소드 작성
		return PI;}
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle cir = new Circle(5.0); //객체 생성, 생성자 호출시 반지름을 5.0으로 설정
		
		System.out.println("면적: "+cir.getArea());//원의 면적 계산하여 출력
		System.out.println("둘레: "+cir.getPerimeter()+"\n");// 원의 둘레 계산하여 출력
		
		Circle cir2 = new Circle(); //새로운 객체 생성
		System.out.print("새로운 반지름 입력: "); //사용자로부터 새로운 반지름을 입력
		double r = scan.nextDouble();
		cir2.setRadius(r); //기존 객체의 radius를 변경 (set 함수 호출)
		
		System.out.println("면적: "+cir2.getArea());//원의 면적 계산하여 출력
		System.out.println("둘레: "+cir2.getPerimeter());// 원의 둘레 계산하여 출력		
		}
}
