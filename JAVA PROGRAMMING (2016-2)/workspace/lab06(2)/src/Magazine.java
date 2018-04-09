
public class Magazine extends Book{
	int date; //발매일 정보
	
	public Magazine(){ //생성자
		super();// 부모 생성자 호출, 부모 생성자 직접 적지 않아도 컴파일러가 부모 생성자 우선 수행함
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}	
}

/*Book 클래스의 하위 클래스로 작성
추가 속성 정보:  발매일 정보
한 개 이상의 생성자를 작성
생성자 내에서 부모 생성자를 호출
각 필드에 대하여 접근자 메소드와 설정자 메소드를 작성
*/