package a20_7_03;

public class ch05Test2 {
	public static void main(String[] args) {
		int a, b;// int c;
		for (a = 7; a >= 1; a--) { // if(a<=2) c=2;
									// else c=a;
			for (b = 1; b <= a; b++) // a ��� c�� ����
			{
				System.out.print("*");
				if (a == 1) {
					System.out.println("*");
					break;
				}
			}
			System.out.println();

		}
	}
}
