
public class Magazine extends Book{
	int date; //�߸��� ����
	
	public Magazine(){ //������
		super();// �θ� ������ ȣ��, �θ� ������ ���� ���� �ʾƵ� �����Ϸ��� �θ� ������ �켱 ������
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}	
}

/*Book Ŭ������ ���� Ŭ������ �ۼ�
�߰� �Ӽ� ����:  �߸��� ����
�� �� �̻��� �����ڸ� �ۼ�
������ ������ �θ� �����ڸ� ȣ��
�� �ʵ忡 ���Ͽ� ������ �޼ҵ�� ������ �޼ҵ带 �ۼ�
*/