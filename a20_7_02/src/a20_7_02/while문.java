package a20_7_02;
/*while(조건){	}
do{　}while(조건)*/
public class while문 
//1부터 100까지 출력 + 그 합계를 구하시오
//5의 배수의 갯수를 구하시오
{	public static void main(String[] args) 
	{	int a = 1; int sum = 0; int cnt=0; int na;
		while(a<=100) 
		{	sum=sum+a;
			System.out.println(a);
			na=a-a/5*5;
			if(na==0) 
			{cnt = cnt+1;}
			a++;
		}
	System.out.println("합계 : " + sum);
	System.out.println("5의 배수 갯수 : " + cnt);
	}
}
