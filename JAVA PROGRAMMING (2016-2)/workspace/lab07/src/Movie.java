
public class Movie extends Item{
	String director;
	public Movie (String name, int price) {};
	
	public String toString() {
		return "[Movie]"+name+", ����: "+director;
	} 
}
/*�Ӽ�: ����
������ �ۼ�
�̸�, ����, ������ �Ű������� �޾Ƽ� ����
toString �޼ҵ� ������ (��� ��� ����)
*/