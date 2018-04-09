import java.util.Scanner;

class Overload{
int max(int i,int j){
	if (i>=j)
		return i;
		//System.out.println(i);
	else
		return j;
		//System.out.println(j);
	}

double max(double k, double m){
	if (k>=m)
		return k;
		//System.out.println(k);
	else
		return m;
		//System.out.println(m);
	}
}

public class MaxOverloadTest { //두 수 비교 프로그램

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Overload ov = new Overload();
		
		System.out.print("Enter the 2 integer number: ");
		int i1 = scan.nextInt(); //정수
		int i2 = scan.nextInt(); //정수
		
		System.out.println("The bigger number(integer) is "+ov.max(i1,i2));
		
		System.out.print("Enter the 2 real number: ");
		double r1 = scan.nextDouble(); //실수
		double r2 = scan.nextDouble(); //실수
		
		System.out.println("The bigger number(double) is "+ov.max(r1,r2));
	}
}
