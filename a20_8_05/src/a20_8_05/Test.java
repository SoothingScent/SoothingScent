package a20_8_05;

class Takoyaki {
	int ����, ��ä, ����, �������ν�, �ҽ�;
	int Ÿ�ھ߳�;
	int ��ǰ;

	void �����() {
		Ÿ�ھ߳� = ���� + ���� + ��ä + ����;
	}

	void �Ǹ�() {
		��ǰ = Ÿ�ھ߳� + �������ν� + �ҽ�;
		System.out.println(��ǰ);
	}

	Takoyaki(int ����, int ��ä, int ����) {
		this.���� = ����;
		this.��ä = ��ä;
		this.���� = ����;
		�������ν� = 5;
		�ҽ� = 5;
	}

	Takoyaki() {

	}
}

public class Test {
	public static void main(String[] args) {
		Takoyaki Yuuka = new Takoyaki(10, 10, 35);
		Yuuka.�����();
		Yuuka.�Ǹ�();
	}
}
