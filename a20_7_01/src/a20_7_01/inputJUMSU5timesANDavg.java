package a20_7_01;

import java.util.Scanner;

//점수를 5회 입력받아서 평균을 구하라
public class inputJUMSU5timesANDavg {
	public static void main(String[] args)
	{
		int sum=0, cnt=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5;i++)
	{		System.out.println("점수를 입력하시오");
			int jumsu = sc.nextInt();
			sum = sum + jumsu;		
			cnt++;
	}
				System.out.println("총점 : " + sum + "점");
				System.out.println("평균 : " + (double)sum/cnt + "점");
	}
}