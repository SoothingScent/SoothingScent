package a20_7_02;

public class aTest1 
{
	public static void main(String[] args)
	{	int a=1; int sum=0; int cnt=0 ;
		for(a=1;a<=100;a++) 
		{	if(a%2==0)
			{	sum = sum + a;
				cnt = cnt + 1;
			}
	
		}System.out.println(sum/(double)cnt);
	}

}
