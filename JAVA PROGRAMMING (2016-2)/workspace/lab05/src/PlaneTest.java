import java.util.Scanner;

class Plane {
	private int id;
	private int model;
	private int count;
	static int planes;
	
	public Plane(int id1) {
		setId(id1);	
		planes++;
	}
	
	public Plane(int id2, int model2) {
		setId(id2);
		setModel(model2);	
		planes++;
	}
	
	public Plane(int id3, int model3, int count3) {
		setId(id3);
		setModel(model3);
		setCount(count3);		
		planes++;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public static int getPlanes() {
		return planes;
	}
	public static void setPlanes(int planes) {
		Plane.planes = planes;
	}
	
	public String toString(){
		System.out.println("id: "+getId()+
				", model: "+getModel()+", totalcount: "+getCount());
		
		return null;}	
}

public class PlaneTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Plane plane1 = new Plane(1);
		plane1.setModel(100);
		plane1.setCount(300);
		
		Plane plane2 = new Plane(2, 101);
		plane2.setCount(320);
		
		Plane plane3 = new Plane(3, 102, 100);
		
		plane1.toString();
		plane2.toString();
		plane3.toString();
		
		System.out.println("number of planes: "+Plane.getPlanes());
	}
}

