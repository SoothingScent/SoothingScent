
public class ����� extends �ؾ {

	private int Ʋ;
	private int ���;

	public void show() {
		System.out.println(Ʋ);
	}
	// ��ӵ� �޼ҵ�� �ڽ��� �޼ҵ尡 ������ ��
	// �ڽ��� �޼ҵ尡 �����(������)(overriding)

	public void ����������() {
		Ʋ = ���� + ��� + ����;
	}

	public �����() {
		System.out.println("�����");
	}

	public �����(int ���, int ����) {
		this.��� = ���;
		this.���� = ����;
	}
}
