package a20_7_02;

public class while문2
{
	public static void main(String[] args) 
	{	int i = 1;
		while(true) //무한반복 = for(;;)
		{	System.out.println(i);
			if(i>=10) break;
			i++;
		}
	}
}
