

import java.io.IOException;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) throws IOException {
		/*����ڷκ��� ������ ������ ���� �򰡸� �Է� �޾Ƽ� ���� �λ���� �����Ͽ� �λ�� ������ ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���� ������ ���� �λ��
A: 6% �λ��
B: 4% �λ��
C: 1.6% �λ��
����:
���� ��:
����� ����:
*/
Scanner scan = new Scanner(System.in);
System.out.print("����: ");
double sal = scan.nextInt(); //salary
System.out.print("���� ��: ");
char eva = (char)System.in.read();//evaluate

System.out.print("����� ����: "); //change salary

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
