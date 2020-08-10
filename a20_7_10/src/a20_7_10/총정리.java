package a20_7_10;

public class 총정리 {
	public static int sign(int a) {
		int res = 0;
		if (a > 0)
			res = 1;
		if (a == 0)
			res = 0;
		if (a < 0)
			res = -1;
		return res;
	}

	public static int abs(int a) {
		int plus = 0;
		if (a >= 0)
			plus = a;
		else if (a < 0)
			plus = -a;
		return plus;
	}

	public static int add(int a, int b) {
		int sum = a + b;

		return sum;
	}

	public static int operator(int a, char x, int c) {
		int OP = 0;
		if (x == '+')
			OP = a + c;
		else if (x == '-')
			OP = a - c;
		else if (x == '*')
			OP = a * c;
		else if (x == '/')
			OP = a / c;
		/*
		 * switch(x) { case '+': OP=a+c; break; case '-': OP=a-c; break; case '*':
		 * OP=a*c; break; case '/': OP=a/c; break; }
		 */
		return OP;
	}

	public static int prime(int a) {
		int b = 2;
		while (a % b != 0) {
			b++;
		}
		if (a == b)
			return 1;
		else
			return -1;
	}

	public static void primes(int a) {
		int A[] = new int[100];
		int C = 0, D = 0;
		while (C <= a) {
			C++;
			if (a % C == 0) {
				A[D] = C;
				D++;
			}
		}
		System.out.print("7번\t");
		for (int i = 0; i < D; i++) {
			System.out.println(A[i]);
			System.out.print("\t");
		}
	}

	public static char hak(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		char Res;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			Res = 'A';
			break;
		case 8:
			Res = 'B';
			break;
		case 7:
			Res = 'C';
			break;
		default:
			Res = 'F';
		}
		return Res;
	}

	public static void main(String[] args) {
		System.out.print("1번\t");
		System.out.println(add(10, 50));
		System.out.print("2번\t");
		System.out.println(sign(-3));
		System.out.print("3번\t");
		System.out.println(abs(50));
		System.out.print("4번\t");
		System.out.println(prime(24));
		System.out.print("5번\t");
		System.out.println(operator(10, '+', 20));
		System.out.print("6번\t");
		System.out.println(hak(100, 90, 78));
		primes(8);
	}

}
