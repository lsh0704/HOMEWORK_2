
public class Book extends Item{
	String author;
	public Book(String name, int price) {};
	public String toString() {
		return "[Book]"+name+", ����: "+author;
	}
}
 /*�Ӽ�: ����
������ �ۼ�
�̸�, ����, ���ڸ� �Ű������� �޾Ƽ� ����
toString �޼ҵ� ������ (��� ��� ����)
*/