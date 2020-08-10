package a20_7_17;

import java.util.Scanner;

public class 진법변환2 {
	public static void main(String[] args) {

		int DEC, ARRAY_SIZE, CNT, MOK, NMG, SUBSCRIPT;
		Scanner sc = new Scanner(System.in);
		DEC = sc.nextInt();
		ARRAY_SIZE = 10;
		CNT = 0;
		int BIN[] = new int[ARRAY_SIZE];

		do {
			MOK = DEC / 2;
			NMG = DEC - MOK * 2;
			CNT++;
			SUBSCRIPT = (ARRAY_SIZE) - CNT;
			BIN[SUBSCRIPT] = NMG;
			if (MOK != 0)
				DEC = MOK;
		} while (MOK != 0);
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print(BIN[i]);
		}
	}
}
