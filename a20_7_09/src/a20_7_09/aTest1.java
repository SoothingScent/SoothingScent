package a20_7_09;

public class aTest1 {
	public static void main(String[] args) {
		int a[][]=new int[3][]; //���� ���� 3��, ���� ����x
		a[0]= new int[2]; //0���϶� 2��
		a[1]= new int[3];//1���϶� 3��
		a[2]= new int[4];//2���϶� 4�� //�ึ�� ���� ������ �ٸ�
		System.out.println(a.length);//���� ����
		System.out.println(a[0].length);//ù��° ���� �� ����
		System.out.println(a[1].length);//�ι�° ���� �� ����
		System.out.println(a[2].length);//����° ���� �� ����
	}
}
