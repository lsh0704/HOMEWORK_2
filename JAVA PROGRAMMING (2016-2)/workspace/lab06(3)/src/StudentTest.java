import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws java.io.IOException { 
		Scanner scan = new Scanner(System.in);
		
		Human man[] = new Human[3]; //�޸� ũ��
		Student stu[] = new Student[3]; //�л� ũ��
		int i;
		String name, major, age, sID;
		
		for (i=0; i<=2; i++){ //����ڷκ��� �̸��� ���̸� �Է� �޾Ƽ� 3���� Human ��ü�� ����
			if (i>=1)
				scan.nextLine();
				//System.in.read();
			System.out.print("["+(i+1)+"] Human �Է�: ");
			name = scan.next();
			age = scan.next();			
			//scan.nextLine(); //�����Է½�, age�� "" �� �� �����Ƿ� ��������			
			man[i]=new Human(name,age); //��ü ����		
			
			if (i>=1 && man[i].equals(man[i-1])==true)
				System.out.println("�ߺ�");
		}		
		for (i=0; i<=2; i++){ //����ڷκ��� �̸�,����,����,�й��� �Է� �޾Ƽ� 3���� Student ��ü ����
			System.out.print("["+(i+1)+"] Student �Է�: ");
			name = scan.next();
			age = scan.next();
			major = scan.next();
			sID = scan.next();
			scan.nextLine(); //�����Է½�, age�� "" �� �� �����Ƿ� ��������	
			stu[i]=new Student(name,age,major,sID); //��ü ����
		}
		
		for (i=0; i<3; i++){ //�� ��ü�������� �̸����� ��¹� �ۼ�
			System.out.println(man[i].toString());
		}
		for (i=0; i<3; i++){ //�� ��ü�������� �̸����� ��¹� �ۼ�
			System.out.println(stu[i].toString());
		}
	}
}