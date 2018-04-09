import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random gen = new Random(); 
		int answer = gen.nextInt(10) +1; //1~10 범위의 중 정수 값 생성
		
		int guess;
		int count=0; //답 입력횟수
		do {
		System.out.print("Guess a number: ");
		guess = scan.nextInt(); //추측 넘버 입력
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
