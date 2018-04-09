

import java.util.Scanner;

public class MovieTest { //3_3

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char arr[][] = new char[8][12];
		int i, j;
		
		arr[0][0]=' '; //0,0 공백표시
		for (i=1; i<8; i++) //행표시
			arr[i][0]+='\u0041'+i-1; //A에서 0~6까지 더해줌
		
		for (i=1; i<10; i++) //렬표시
			arr[0][i]+='\u0030'+i; //0에서 1씩 더해줌 1~9까지
		//arr[0][10]=(char)10; /*왜 10이 안되는지.. char는 1byte만 받을 수 있어서?*/
		arr[0][10]='1'; //10의 경우는 두자리수이므로 '1''0'으로 만들어 하나의 수처럼 보이도록.
		arr[0][11]='0';
		
		for (i=1; i<8; i++) //전좌석  0으로 초기화
			for (j=1; j<11; j++)
				arr[i][j]='0';
		
		while (100<200){
			for (j=0; j<12; j++){
				if (j==10)
					System.out.print(arr[0][j]);
				else if (j!=10)
					System.out.print(arr[0][j]+"  ");
				if (j==11)
					System.out.println("");}
			
			for (i=1; i<8; i++) //전좌석 출력
			for (j=0; j<11; j++){
				System.out.print(arr[i][j]+"  ");
				if (j==10)
					System.out.println("");}
		
		System.out.print("좌석 입력(종료시 0): ");
		String sel = scan.next(); //좌석입력
		
		if (sel.charAt(0)=='0') //0입력시 종료
			break;
		
		for (i=1; i<8; i++){ //탐색
			if (arr[i][0]==sel.charAt(0)){ //알파벳비교
				
				if (arr[0][1]==sel.charAt(1) || arr[0][10]==sel.charAt(1)){//1,10비교
					if (sel.length()==3) /*문자 3개(널문자포함하여) 존재하는지 확인*/{
						if (sel.charAt(2)==arr[0][11]){ //10번째 열
							arr[i][10]='1';
							break;}
						}
					arr[i][1]='1'; //1번째 열
					break;}
				
				for (j=2; j<10; j++){ //숫자 2~9비교
					if (arr[0][j]==sel.charAt(1)){ 
						if (arr[i][j]=='0'){ //좌석예매성공
							arr[i][j]='1';
							break;}
						else if (arr[i][j]=='1'){ //예매실패
							System.out.println("선택 불가");
							break;}	
						}
					}
				}
			}
		}	
	}
}