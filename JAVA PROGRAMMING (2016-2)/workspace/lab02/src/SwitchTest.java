

import java.io.IOException;

public class SwitchTest {

	public static void main(String[] args) throws IOException{
		/*Ű���忡�� ���� �ϳ��� �о ����(a, e, i, o , u)�� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ��, �Լ��� ������� �ʰ� switch������ ����Ͽ� ���ڸ� �����Ѵ�.(���ĺ� �ҹ��ڸ� ����)*/
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		char ch = (char)System.in.read(); //���� �ϳ� �о����
		
		switch (ch){
		case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println("�Էµ� ���� "+ch+"�� �����Դϴ�. ");
			break;
		default:
			System.out.println("�Էµ� ���� "+ch+"�� �����Դϴ�. ");
			break;
		}

	}

}
