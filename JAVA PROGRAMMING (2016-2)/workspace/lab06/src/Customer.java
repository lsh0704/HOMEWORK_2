
public class Customer extends Person{
	int customer_num; //고객번호
	int mileage; //마일리지
	
	public Customer() {} //생성자
	
	public int getCustomer_num() {
		return customer_num;
	}
	public void setCustomer_num(int customer_num) {
		this.customer_num = customer_num;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}	
}

/*Customer 클래스
Person 클래스의 하위 클래스로 작성
추가 속성 정보:  고객번호, 마일리지
한 개 이상의 생성자를 작성
각 필드에 대하여 접근자 메소드와 설정자 메소드를 작성
*/