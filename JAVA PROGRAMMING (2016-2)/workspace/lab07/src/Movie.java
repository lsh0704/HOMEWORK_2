
public class Movie extends Item{
	String director;
	public Movie (String name, int price) {};
	
	public String toString() {
		return "[Movie]"+name+", 감독: "+director;
	} 
}
/*속성: 감독
생성자 작성
이름, 가격, 감독을 매개변수로 받아서 설정
toString 메소드 재정의 (출력 결과 참고)
*/