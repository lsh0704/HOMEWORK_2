import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random gen = new Random(); 
		int answer = gen.nextInt(10) +1; //1~10 ������ �� ���� �� ����
		
		int guess;
		int count=0; //�� �Է�Ƚ��
		do {
		System.out.print("Guess a number: ");
		guess = scan.nextInt(); //���� �ѹ� �Է�
		count++;
			
		if (answer < guess)
			System.out.println("Answer is less than guess.");
		else if (answer > guess)
			System.out.println("Answer is greater than guess.");
		if (answer==guess)
			break;
		} while(answer!=guess);
		
		System.out.println("Congratulation!"
				+ "you had "+count+" chance(s) to guess the answer.");
	}
}
