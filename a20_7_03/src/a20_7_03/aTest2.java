package a20_7_03;
//while(){} , do{}while() 사용해서 1,2,...10(a)까지 출력
public class aTest2 
{
	public static void main(String[] args)
	{
		int a=1;
		while(a<=10) 
		{
			System.out.println(a);
			a++;
		}
		
		int b=1;
		do {
			
			System.out.println(b);
			b++;
		}while(b<=10);
		
	}
}
