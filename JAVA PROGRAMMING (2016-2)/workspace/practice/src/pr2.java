class Hello {
	String title;
	int value;
	public Hello() {
		title += " World";
	}
	public Hello(int value) {
		Hello();
		this.value = value;
		title += "Hello";
	}
}

public class pr2 {

	public static void main(String[] args) {
		Hello c = new Hello(5);
		System.out.println(c.title);
	}
}

