package a20_7_14;


public class aTest1 {
	
	void main(String[] args) {
		�ؾ kim;
		kim = new �ؾ(); // �ٸ� class ȣ��, kim = �ؾ �ڷ��� ��ü
		kim.��=2;
		kim.����=10;
		kim.�����();
		kim.������();
		
		�ؾ lee;
		lee = new �ؾ();
		lee.��=1;
		lee.����=5;
		lee.�����();
		lee.������();
	}
	class �ؾ {
		int Ʋ;
		int ����;
		int ��;

		void �����() {
		Ʋ=����+��+����;
		}

		void ������() {
			System.out.println(Ʋ);
		}
	}
}
