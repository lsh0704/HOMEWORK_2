

import java.util.Random;
import java.util.Scanner;

public class GradingTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gen = new Random(); //���� ���� ����
		int id_answer[][] = new int[5][10];
		int i; int j;
		
		for (i=0; i<5; i++){
			System.out.print("["+i+"]��° �л� �� �Է�: "); //���� 1~4���� ������.
			for (j=0; j<10; j++) //�� �Է�
				id_answer[i][j] = scan.nextInt();}
		
		System.out.print("����: ");
		int[] answer = new int[10]; //���� ����
		for (i=0; i<10; i++){
			answer[i]=gen.nextInt(4) +1;
			System.out.print(answer[i]+" ");}
		System.out.println("");
		
		int score=0;
		for (i=0; i<5; i++, score=0){
			for (j=0; j<10; j++) //ä��
				if (id_answer[i][j]==answer[j])
					score++;
			System.out.print("�л� "+i+"�� ����: "+score);
			System.out.println("");}
	}
}
