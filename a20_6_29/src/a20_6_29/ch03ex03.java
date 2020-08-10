package a20_6_29;

public class ch03ex03 {
	public static void main(String[] args) {
		int a = 12, b = 4;
		int c,d,e,f;
		c = a ^ b;
/*		a 값과 b 값을 비트로 변환 후 xor한 결과
		(두 비트가 다르면 1 같으면 0)
		1100(12) xor 0100(4) 이므로 1000 = 8 이 산출됨*/
		d = a << 3; //왼쪽으로 3 비트 이동 12 x 2의 3승
		//00001100(12) -> 01100000(96)
		e = a >> 3; //오른쪽으로 3 비트 이동 12 / 2의 3승
		//00001100(12) -> 00000001(1) (1은 지워짐)
		f = ~a+1; // 1의 보수+1 (2의보수)
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
	}

}
