
public class Book {
	String title; //제목
	int page; //페이지수
	String author; //저자
	static int count; //책의 개수
	
	public Book() { //생성자
		count++;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	static int getCount() { //책의 개수에 대한 접근자 메소드(클래스 메소드)
		return count; 
	}	
}
//클래스 메소드 : 객체 생성하지 않아도 클래스 메소드 호출 가능
/*Book 클래스
속성 정보: 제목, 페이지수, 저자, 책의 개수(count-클래스 변수로 정의)
하나 이상의 생성자를 정의
책이 생성될 때마다 책의 수(count)를 증가
각 필드에 대하여 접근자와 설정자 메소드를 작성
책의 개수에 대해서는 접근자 메소드만 클래스 메소드로 작성
*/
