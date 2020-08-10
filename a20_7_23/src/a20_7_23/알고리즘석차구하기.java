package a20_7_23;

import java.util.Scanner;

public class 알고리즘석차구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int jumsu[] = new int[5];
		int rank[] = new int[5];
		for (i = 0; i < 5; i++) {
			jumsu[i] = sc.nextInt();
			rank[i] = 1;
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (jumsu[i] < jumsu[j])
					rank[i]++;
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.println(jumsu[i] + "점" + ", " + rank[i] + "등");
		}
	}
}
