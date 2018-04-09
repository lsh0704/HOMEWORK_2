import java.util.Scanner;

class Date {
	String name;
	int year;
	int month;
	int day;}

public class DateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i;
		Date[] d_day = new Date[5]; //d-day 배열 선언 및 생성
		
		for (i=0; i<5; i++){
			d_day[i]=new Date(); //객체 생성
			System.out.print("Dday: ");
			d_day[i].name = scan.next();
			
			System.out.print("날짜: ");
			d_day[i].year = scan.nextInt();
			d_day[i].month = scan.nextInt();
			d_day[i].day = scan.nextInt();}
		
		for (i=0; i<5; i++) //출력
			System.out.println(d_day[i].name+" : "
		+d_day[i].year+"/"+d_day[i].month+"/"+d_day[i].day);
	}
}