

import java.io.IOException;

public class SwitchTest {

	public static void main(String[] args) throws IOException{
		/*키보드에서 문자 하나를 읽어서 모음(a, e, i, o , u)과 자음을 구분하는 프로그램을 작성하시오.
		 * 단, 함수를 사용하지 않고 switch문만을 사용하여 문자를 구분한다.(알파벳 소문자만 가정)*/
		System.out.print("문자를 입력하시오: ");
		char ch = (char)System.in.read(); //문자 하나 읽어들임
		
		switch (ch){
		case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println("입력된 문자 "+ch+"는 모음입니다. ");
			break;
		default:
			System.out.println("입력된 문자 "+ch+"는 자음입니다. ");
			break;
		}

	}

}
