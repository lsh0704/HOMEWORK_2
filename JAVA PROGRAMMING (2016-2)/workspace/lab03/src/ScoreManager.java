

import java.util.Scanner;

public class ScoreManager { //3_1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5]; //�л� �̸� �����ϴ� ���ڿ� �迭		
		int[] score = new int[5]; //�л� ���� �����ϴ� ������ �迭
		
		for (int i=0; i<score.length; i++){
			System.out.print("["+i+"]�л� ����(�̸� ����): ");
			name[i]=scan.next();
			score[i]=scan.nextInt();
		} //�̸�, ���� �Է�
		
		System.out.println("<<�л� ����>>");
		System.out.println("�̸�\t\t����");
		System.out.println("======================");
		
		double sum=0;
		for (int j=0; j<score.length; j++){
			System.out.println(name[j]+"\t\t"+score[j]);
			sum+=score[j];
		}
		System.out.println("======================"); //���� ����
		System.out.print("��ü �л� ���: "+(sum/score.length));		
	}
}
