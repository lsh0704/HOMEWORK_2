

import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년: "); //년도 입력
		int year = scan.nextInt();
		boolean yearValid; //년도 올바르게 입력했는가
		if (year>=1000 && year<3000)
			yearValid=true;
		else
			yearValid=false;

		boolean leapYear; //윤년확인
		if ((year%4==0 && year%100!=0) || year%400==0)
			leapYear=true;
		else
			leapYear=false;
		
		System.out.print("월: "); //월 입력
		int month = scan.nextInt();
		int daysInMonth;
		boolean monthValid;
		
		if (month>=1 && month<=12)
			monthValid=true;
		else{
			monthValid=false;
			daysInMonth=0;}
			
		System.out.print("일: ");
		daysInMonth = scan.nextInt();
		boolean dayValid=false;
		
		if (month%2!=0 && (daysInMonth>=0 && daysInMonth<=31)) //홀수달
			dayValid=true;
		else if (month%2==0 && (daysInMonth>=0 && daysInMonth<=30)) { //짝수달
			if (month==2) //윤년인 경우 2월은 29일
				{if (leapYear==true)
					if (daysInMonth<=29)
						dayValid=true;
				else
					if (daysInMonth<=28) //아닌경우 2월은 28일
					dayValid=true;}
			else
				dayValid=true;}
		
		if (yearValid==true && monthValid==true && dayValid==true){
			System.out.print("Date is valid! ");
			if (leapYear==true)
				System.out.print("LeapYear");
			}
		else
			System.out.print("Date is not valid ");
	}
}
