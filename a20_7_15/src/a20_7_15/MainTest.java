package a20_7_15;

public class MainTest {
	public static void main(String[] args) {
		��� kim = new ���();
		kim.setName("ȫ�浿");
		kim.setSalary(3000);
		kim.show();

		System.out.println("=============");

		�Ŵ��� m = new �Ŵ���();
		m.setName("�̹�ȣ");
		m.setSalary(5000);
		m.setDepartment("ȫ����");
		m.show();
		m.show("������");

		System.out.println("=============");
		������ dog = new ������();
		dog.show();
		
	}
}
//overloading : �̸��� ������ �޼ҵ带 2�� �̻� ���� �� ����
//ex) void show(){}, void show(String man){}