package ����;

import java.util.Scanner;

public class �˰��� {
	public static void main(String args[])
	   {
	      int s[] = new int[20];
	      int c = 0;
	       int k = 2;
	       int y = 0;
	       
	      Scanner sc = new Scanner(System.in);
	       System.out.print("���� �Է� : ");
	       
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
	                   System.out.println("�Ҽ�");
	                }
	             }
	             
	             else
	             {
	                for(y = 1; y >= c-1; c++)
	                {
	                   System.out.println(c + "��°���μ� : " + s[y]);
	                }
	                System.out.println("���°� : " + s[c]);
	             }
	          }
	          
	          else
	          {
	             System.out.println("�μ����� �ȵ�");
	          }
	       }
	   }
}
