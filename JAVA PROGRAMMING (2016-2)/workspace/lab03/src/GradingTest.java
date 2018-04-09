

import java.util.Random;
import java.util.Scanner;

public class GradingTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gen = new Random(); //랜덤 숫자 생성
		int id_answer[][] = new int[5][10];
		int i; int j;
		
		for (i=0; i<5; i++){
			System.out.print("["+i+"]번째 학생 답 입력: "); //답은 1~4까지 존재함.
			for (j=0; j<10; j++) //답 입력
				id_answer[i][j] = scan.nextInt();}
		
		System.out.print("정답: ");
		int[] answer = new int[10]; //실제 정답
		for (i=0; i<10; i++){
			answer[i]=gen.nextInt(4) +1;
			System.out.print(answer[i]+" ");}
		System.out.println("");
		
		int score=0;
		for (i=0; i<5; i++, score=0){
			for (j=0; j<10; j++) //채점
				if (id_answer[i][j]==answer[j])
					score++;
			System.out.print("학생 "+i+"의 점수: "+score);
			System.out.println("");}
	}
}
