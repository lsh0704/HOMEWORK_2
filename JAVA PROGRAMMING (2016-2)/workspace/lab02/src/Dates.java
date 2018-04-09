

import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��: "); //�⵵ �Է�
		int year = scan.nextInt();
		boolean yearValid; //�⵵ �ùٸ��� �Է��ߴ°�
		if (year>=1000 && year<3000)
			yearValid=true;
		else
			yearValid=false;

		boolean leapYear; //����Ȯ��
		if ((year%4==0 && year%100!=0) || year%400==0)
			leapYear=true;
		else
			leapYear=false;
		
		System.out.print("��: "); //�� �Է�
		int month = scan.nextInt();
		int daysInMonth;
		boolean monthValid;
		
		if (month>=1 && month<=12)
			monthValid=true;
		else{
			monthValid=false;
			daysInMonth=0;}
			
		System.out.print("��: ");
		daysInMonth = scan.nextInt();
		boolean dayValid=false;
		
		if (month%2!=0 && (daysInMonth>=0 && daysInMonth<=31)) //Ȧ����
			dayValid=true;
		else if (month%2==0 && (daysInMonth>=0 && daysInMonth<=30)) { //¦����
			if (month==2) //������ ��� 2���� 29��
				{if (leapYear==true)
					if (daysInMonth<=29)
						dayValid=true;
				else
					if (daysInMonth<=28) //�ƴѰ�� 2���� 28��
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
