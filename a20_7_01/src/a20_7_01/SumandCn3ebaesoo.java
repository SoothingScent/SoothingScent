package a20_7_01;
public class SumandCn3ebaesoo {
	/*a가 1부터 100까지 1씩 증가하되,
	 짝수를 찾아서 출력하시오*/
	public static void main(String[] args)
	{	int a;
		int sum=0,cn=0;
		for(a=1;a<=100;a++)
		{	if(a%3==0)
			{	sum=sum+a;
				cn=cn+1;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("갯수 : " + cn);
		System.out.println("평균 : " + (double)sum/cn);
	}
}