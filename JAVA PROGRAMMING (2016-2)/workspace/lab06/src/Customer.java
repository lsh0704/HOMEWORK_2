
public class Customer extends Person{
	int customer_num; //����ȣ
	int mileage; //���ϸ���
	
	public Customer() {} //������
	
	public int getCustomer_num() {
		return customer_num;
	}
	public void setCustomer_num(int customer_num) {
		this.customer_num = customer_num;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}	
}

/*Customer Ŭ����
Person Ŭ������ ���� Ŭ������ �ۼ�
�߰� �Ӽ� ����:  ����ȣ, ���ϸ���
�� �� �̻��� �����ڸ� �ۼ�
�� �ʵ忡 ���Ͽ� ������ �޼ҵ�� ������ �޼ҵ带 �ۼ�
*/