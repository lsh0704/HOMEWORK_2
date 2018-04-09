import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws java.io.IOException { 
		Scanner scan = new Scanner(System.in);
		
		Human man[] = new Human[3]; //휴먼 크기
		Student stu[] = new Student[3]; //학생 크기
		int i;
		String name, major, age, sID;
		
		for (i=0; i<=2; i++){ //사용자로부터 이름과 나이를 입력 받아서 3명의 Human 객체를 생성
			if (i>=1)
				scan.nextLine();
				//System.in.read();
			System.out.print("["+(i+1)+"] Human 입력: ");
			name = scan.next();
			age = scan.next();			
			//scan.nextLine(); //엔터입력시, age에 "" 들어갈 수 있으므로 엔터제거			
			man[i]=new Human(name,age); //객체 생성		
			
			if (i>=1 && man[i].equals(man[i-1])==true)
				System.out.println("중복");
		}		
		for (i=0; i<=2; i++){ //사용자로부터 이름,나이,전공,학번을 입력 받아서 3명의 Student 객체 생성
			System.out.print("["+(i+1)+"] Student 입력: ");
			name = scan.next();
			age = scan.next();
			major = scan.next();
			sID = scan.next();
			scan.nextLine(); //엔터입력시, age에 "" 들어갈 수 있으므로 엔터제거	
			stu[i]=new Student(name,age,major,sID); //객체 생성
		}
		
		for (i=0; i<3; i++){ //각 객체참조변수 이름으로 출력문 작성
			System.out.println(man[i].toString());
		}
		for (i=0; i<3; i++){ //각 객체참조변수 이름으로 출력문 작성
			System.out.println(stu[i].toString());
		}
	}
}