
public class Student extends Human{
	String major; //전공
	String sID; //학번
	
	public Student(String name,String age,String major,String sID){ //생성자
		super(name, age); //부모 클래스의 생성자 호출 (이름, 나이)
		this.major=major;
		this.sID=sID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() { //부모의 toString()을 호출하여 받아온 문자열 값에 추가로 전공 값 연결하여 문자열 반환
		return "[학생 정보]"+super.toString()+
				", 전공: "+getMajor()+", 학번: "+sID;		
	}

	public boolean equals(Student student) { //학번이 같을 때 true를 반환
		return (this.sID==student.sID); 
	}	
}
