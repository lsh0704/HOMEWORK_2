import java.util.Scanner;

class BookList {
	String title;
	String author;
	String category;
	int pages;
	int point;}

public class BookTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookList[] book = new BookList[3]; //book �迭 ����� ����
		
		book[0] = new BookList(); //��ü ����
		book[0].title = "��ǳ�� ġ�� �㿡";
		book[0].author = "Ű���� ����ġ";
		book[0].category = "��̹���"; 
		book[0].pages = 48;
		book[0].point = 5;
		
		book[1] = new BookList(); //��ü ����
		book[1].title = "���۸���";
		book[1].author = "������";
		book[1].category = "�ѱ��Ҽ�"; 
		book[1].pages = 420;
		book[1].point = 5;
		
		book[2] = new BookList(); //��ü ����
		book[2].title = "�ٻ����� �ູ ����";
		book[2].author = "�������� ���θ�";
		book[2].category = "�������Ҽ�"; 
		book[2].pages = 220;
		book[2].point = 4;
		
		System.out.println("����\t\t����\t\t�з�\t\t��������\t\t����");
		
		for (int i=0; i<3; i++){
			if (i==1){
				System.out.print(book[i].title+"\t\t");
				System.out.print(book[i].author+"\t\t");}	
			else{
				System.out.print(book[i].title+"\t");
				if (i==0)
					System.out.print(book[i].author+"\t\t");
				else if (i==2)
					System.out.print(book[i].author+"\t");}	
			
			System.out.print(book[i].category+"\t\t"); 
			System.out.print(book[i].pages+"\t\t");
			System.out.println(book[i].point+"\t");}		
	}
}
