

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int anum=3; int bnum=1;
		int a=4;
				
		for (int b=1; b<=bnum*3+1; b++){
			a-=3;
			
			if (b==(bnum*3+1) && b<=10)
				bnum++;
			
			if (b==10 && a<6){ //b가 9가 되면 한줄 내리고 다음 3단씩 준비함
				anum+=3; 
				System.out.println("");
				b=1; //b 초기화
				a+=3; /*a 초기화*/	}		
			
			for (; a<=anum && b<10; a++){
				if (b==1 && (a==1 || a==4 || a==7)){
					int m=a; //count용으로 사용
					for(; m<a+3 ;m++)
						System.out.print(m+"단\t");
					if ((m-1)%3==0)
						System.out.println("");}
								
				System.out.print(a+"*"+b+"="+(a*b)+"\t");
				if (a==anum) //3단 쓰고 한줄 내리기
					System.out.println("");}				
		}
	}
}
