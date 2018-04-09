

import java.io.IOException;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) throws IOException {
		/*사용자로부터 직원의 연봉과 성과 평가를 입력 받아서 연봉 인상률을 적용하여 인상된 연봉을 계산하여 그 결과를 출력하는 프로그램을 작성하시오.
성과 평가의 종류에 따른 인상률
A: 6% 인상률
B: 4% 인상률
C: 1.6% 인상률
연봉:
성과 평가:
변경된 연봉:
*/
Scanner scan = new Scanner(System.in);
System.out.print("연봉: ");
double sal = scan.nextInt(); //salary
System.out.print("성과 평가: ");
char eva = (char)System.in.read();//evaluate

System.out.print("변경된 연봉: "); //change salary

switch (eva) {
case 'A': case 'a':
	sal=1.06*sal;
	break;
case 'B': case 'b':
	sal=1.04*sal;
	break;
case 'C': case 'c':
	sal=1.016*sal;
	break;
}
System.out.print( sal );
	}

}
