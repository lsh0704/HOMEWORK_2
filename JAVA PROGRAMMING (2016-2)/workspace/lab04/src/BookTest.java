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
		BookList[] book = new BookList[3]; //book 배열 선언과 생성
		
		book[0] = new BookList(); //객체 생성
		book[0].title = "폭풍우 치는 밤에";
		book[0].author = "키무라 유이치";
		book[0].category = "어린이문학"; 
		book[0].pages = 48;
		book[0].point = 5;
		
		book[1] = new BookList(); //객체 생성
		book[1].title = "정글만리";
		book[1].author = "조정래";
		book[1].category = "한국소설"; 
		book[1].pages = 420;
		book[1].point = 5;
		
		book[2] = new BookList(); //객체 생성
		book[2].title = "꾸뻬씨의 행복 여행";
		book[2].author = "프랑수아 를로르";
		book[2].category = "프랑스소설"; 
		book[2].pages = 220;
		book[2].point = 4;
		
		System.out.println("제목\t\t저자\t\t분류\t\t페이지수\t\t별점");
		
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
