

import java.util.Scanner;

public class MovieTest { //3_3

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char arr[][] = new char[8][12];
		int i, j;
		
		arr[0][0]=' '; //0,0 ����ǥ��
		for (i=1; i<8; i++) //��ǥ��
			arr[i][0]+='\u0041'+i-1; //A���� 0~6���� ������
		
		for (i=1; i<10; i++) //��ǥ��
			arr[0][i]+='\u0030'+i; //0���� 1�� ������ 1~9����
		//arr[0][10]=(char)10; /*�� 10�� �ȵǴ���.. char�� 1byte�� ���� �� �־?*/
		arr[0][10]='1'; //10�� ���� ���ڸ����̹Ƿ� '1''0'���� ����� �ϳ��� ��ó�� ���̵���.
		arr[0][11]='0';
		
		for (i=1; i<8; i++) //���¼�  0���� �ʱ�ȭ
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
			
			for (i=1; i<8; i++) //���¼� ���
			for (j=0; j<11; j++){
				System.out.print(arr[i][j]+"  ");
				if (j==10)
					System.out.println("");}
		
		System.out.print("�¼� �Է�(����� 0): ");
		String sel = scan.next(); //�¼��Է�
		
		if (sel.charAt(0)=='0') //0�Է½� ����
			break;
		
		for (i=1; i<8; i++){ //Ž��
			if (arr[i][0]==sel.charAt(0)){ //���ĺ���
				
				if (arr[0][1]==sel.charAt(1) || arr[0][10]==sel.charAt(1)){//1,10��
					if (sel.length()==3) /*���� 3��(�ι��������Ͽ�) �����ϴ��� Ȯ��*/{
						if (sel.charAt(2)==arr[0][11]){ //10��° ��
							arr[i][10]='1';
							break;}
						}
					arr[i][1]='1'; //1��° ��
					break;}
				
				for (j=2; j<10; j++){ //���� 2~9��
					if (arr[0][j]==sel.charAt(1)){ 
						if (arr[i][j]=='0'){ //�¼����ż���
							arr[i][j]='1';
							break;}
						else if (arr[i][j]=='1'){ //���Ž���
							System.out.println("���� �Ұ�");
							break;}	
						}
					}
				}
			}
		}	
	}
}