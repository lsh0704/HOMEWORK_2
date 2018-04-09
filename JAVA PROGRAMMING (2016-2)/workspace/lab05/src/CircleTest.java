import java.util.Scanner;

class Circle{
	private double radius;
	static double PI = 3.141592; //PI��� �̸����� 3.141592�� �ʱ�ȭ�� ���� ��� ����
	
	public Circle(double rad){ //�Ű������� ���� �������� �޴� ������ �ۼ�
		radius = rad;
		}	
	public Circle(){ //�Ű������� ���� �����ڷμ� ���� �������� 0.0���� ����
		radius = 0.0;		
		}
	
	public void setRadius(double radius) { //������ �޼ҵ��� setRadius()�� �ۼ�
		this.radius = radius;
		}
	public double getRadius() { //������ �޼ҵ��� getRadius()�� �ۼ�
		return radius;
		}

	public double square(){ //double���� ���� �����Ͽ� ��ȯ�ϴ� square() �޼ҵ带 �ۼ�(���� �޼ҵ�)
		return getRadius() *getRadius();
		}
	
	public double getArea(){ //���� ������ ����ϴ� getArea() �޼ҵ带 �ۼ�, �� �� square() �޼ҵ� ���
		return PI*square();
		}
	public double getPerimeter(){ //���� �ѷ��� ����ϴ� getPerimeter �޼ҵ� �ۼ�
		return 2*PI*getRadius();
		}

	public static double getPI() { //PI ���� ��ȯ�ϴ� ���� �޼ҵ� getPI() �޼ҵ� �ۼ�
		return PI;}
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle cir = new Circle(5.0); //��ü ����, ������ ȣ��� �������� 5.0���� ����
		
		System.out.println("����: "+cir.getArea());//���� ���� ����Ͽ� ���
		System.out.println("�ѷ�: "+cir.getPerimeter()+"\n");// ���� �ѷ� ����Ͽ� ���
		
		Circle cir2 = new Circle(); //���ο� ��ü ����
		System.out.print("���ο� ������ �Է�: "); //����ڷκ��� ���ο� �������� �Է�
		double r = scan.nextDouble();
		cir2.setRadius(r); //���� ��ü�� radius�� ���� (set �Լ� ȣ��)
		
		System.out.println("����: "+cir2.getArea());//���� ���� ����Ͽ� ���
		System.out.println("�ѷ�: "+cir2.getPerimeter());// ���� �ѷ� ����Ͽ� ���		
		}
}
