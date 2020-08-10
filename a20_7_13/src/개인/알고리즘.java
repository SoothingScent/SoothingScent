package 개인;

import java.util.Scanner;

public class 알고리즘 {
	public static void main(String args[])
	   {
	      int s[] = new int[20];
	      int c = 0;
	       int k = 2;
	       int y = 0;
	       
	      Scanner sc = new Scanner(System.in);
	       System.out.print("정수 입력 : ");
	       
	       int n = sc.nextInt();
	       
	       while(n == 1)
	       {
	          if(n%k == 0)
	          {
	             c = c + 1;
	             s[c] = k;
	             n = n/k;
	             if(n == 1)
	             {
	                if(c == 1)
	                {
	                   System.out.println("소수");
	                }
	             }
	             
	             else
	             {
	                for(y = 1; y >= c-1; c++)
	                {
	                   System.out.println(c + "번째소인수 : " + s[y]);
	                }
	                System.out.println("남는값 : " + s[c]);
	             }
	          }
	          
	          else
	          {
	             System.out.println("인수분해 안됨");
	          }
	       }
	   }
}
