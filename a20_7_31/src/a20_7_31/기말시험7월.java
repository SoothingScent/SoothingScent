package a20_7_31;

//�ҽ����� -> �������� ����
//test.java > javac.exe > test.class
public class �⸻����7�� {
	public static void main(String[] args) {
		int S = 0;// 1
		int sa = 0;
		int sw = 0;
		int i = 1;// 2
		do {
			sa = sa + i;// 3
			if (sw == 0) {// 4
				S = S - sa;
				sw = 1;
			} else {
				S = S + sa;// 5
				sw = 0;// 6
			}
			i++;
		} while (i <= 10);// 7
		System.out.println(S);
	}
}
