
public class Person {
	String name; //이름
	String address;//주소
	int phone;//전화번호
	
	public Person() {} //생성자
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}

/*Person 클래스
속성 정보: 이름, 주소, 전화번호
하나 이상의 생성자를 정의
각 필드에 대하여 접근자와 설정자 메소드를 작성
*/
