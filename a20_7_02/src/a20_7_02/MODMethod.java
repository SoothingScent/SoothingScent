package a20_7_02;

public class MODMethod
{
	public static void main(String[] args) 
		{
		int N=0,H=0;
			do 
			{
				N++;
				if(N%2==1) H=H+N*N;
				
			}while(N<99);
			
		System.out.println(H);
		}
}
