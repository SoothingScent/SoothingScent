package a20_7_03;

public class 일부터50까지소수 
{
	public static void main(String[] args) 
	{
		int a,b,cnt;
		for(a=2;a<=50;a++) 
			{
			cnt = 0;
				for(b=1;b<=a;b++) 
				{
					if(a%b==0) cnt=cnt+1;
				}
			if(cnt==2)System.out.println(a);
			}
	}
}
