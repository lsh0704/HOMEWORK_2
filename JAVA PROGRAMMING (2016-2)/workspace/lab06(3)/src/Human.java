public class Human {
	
	String name; //이름
	String age; //나이
	
	public Human(String name,String age) { //생성자, 매개 변수의 값으로 필드를 초기화
		this.name = name; 
		this.age = age;		
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString(){
		// 객체의 현재 값들을 연결하여 문자열로 반환
		return "이름: "+getName()+", 나이: "+getAge();	
	}
	public boolean equals(Human human) { //이름과 나이가 같을 때 true를 반환
		return (this.name==human.name && this.age==human.age);
	}
}
