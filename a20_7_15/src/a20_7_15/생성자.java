package a20_7_15;

//����( a = new �Ҷ�) �ÿ� ���� �ʱ�ȭ�ϱ� ���� �뵵
public class ������/* Constructor �޼ҵ� */ {
	/* Ŭ������� ������ �޼ҵ���̰� return ���� ����(�� void�� ����) */

	private String dog_name;
	private int dog_age;

	public void show() {
		System.out.println("�� �̸� = " + dog_name);
		System.out.println("�� ���� = " + dog_age);
	}

	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;

	}

	public void setDog_age(int dog_age) {
		this.dog_age = dog_age;
	}

	public ������() {// default ������ �޼ҵ�(Ŭ������� ����)
		dog_name = "��Ű";
		dog_age = 3;
	}

	public ������(String dog_name) {
		this.dog_name = dog_name;

	}

	public ������(String dog_name, int dog_age) {
		this.dog_name = dog_name;
		this.dog_age = dog_age;

	}
}//������ method�� overloading ����
