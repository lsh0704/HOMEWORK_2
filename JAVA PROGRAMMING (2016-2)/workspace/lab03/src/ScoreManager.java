

import java.util.Scanner;

public class ScoreManager { //3_1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5]; //학생 이름 저장하는 문자열 배열		
		int[] score = new int[5]; //학생 성적 저장하는 정수형 배열
		
		for (int i=0; i<score.length; i++){
			System.out.print("["+i+"]학생 정보(이름 점수): ");
			name[i]=scan.next();
			score[i]=scan.nextInt();
		} //이름, 점수 입력
		
		System.out.println("<<학생 정보>>");
		System.out.println("이름\t\t성적");
		System.out.println("======================");
		
		double sum=0;
		for (int j=0; j<score.length; j++){
			System.out.println(name[j]+"\t\t"+score[j]);
			sum+=score[j];
		}
		System.out.println("======================"); //성적 나열
		System.out.print("전체 학생 평균: "+(sum/score.length));		
	}
}
