package a20_8_04;

class �߽� {
	�߽�() {

	}

	�߽�(int ¥��, int �����⸧) {
		this.¥�� = ¥��;
		this.�����⸧ = �����⸧;
	}

	int ¥��, ���, ����, �����⸧, �׸�;

	void ¥���() {
		�׸� = ¥�� + ���� + �����⸧;
	}

	void ��ä() {
		�׸� = ��� + ���� + �����⸧;
	}

	void show() {
		System.out.println(�׸�);
	}
}

class �Ͻ� {
	int ��ġ, ����, �췰, ����, �׸�;

	�Ͻ�(Object obj) {
		if (obj instanceof �ѽ�) {
			�ѽ� kor = (�ѽ�) obj;
			kor.�����(200);
			kor.show();
		} else if (obj instanceof �߽�) {
			�߽� chn = (�߽�) obj;
			chn.��ä();
			chn.show();
		}
	}

	�Ͻ�(int �췰, int ����) {
		this.�췰 = �췰;
		this.���� = ����;
	}

	void ȸ����() {
		�׸� = �췰 + ���� + ����;
	}

	void �ʹ�(int ��) {
		�׸� = �� + �췰 + ��ġ + ����;
	}

	void show() {
		System.out.println(�׸�);
	}
}

public class �ѽ� {
	int ����, ��ġ, ���, �׸�;

	void �����(int ��) {
		�׸� = ���� + ��ġ + ��� + ��;
	}

	void show() {
		System.out.println(�׸�);
	}

	public static void main(String[] args) {
		�Ͻ� japan = new �Ͻ�(100, 2);
		�߽� china = new �߽�(50, 30);

		japan.ȸ����();
		japan.show();

		china.��ä();
		china.show();

		�ѽ� korea = new �ѽ�();

		korea.�����(300);
		korea.show();

		�Ͻ� ilhan = new �Ͻ�(new �ѽ�());
		�Ͻ� iljung = new �Ͻ�(new �߽�());
	}
}
