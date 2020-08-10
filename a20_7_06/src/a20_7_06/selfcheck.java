package a20_7_06;

public class selfcheck {
public static void main(String[] args) {
	int a = 1, b = 1, c, cnt=2;
	int sum = a+b;
	do{		c = a+b;
				sum = sum+ c;
											a=b;
											b=c;
				cnt++;
				/*if(cnt>=10) break;
				a = b+c;
				sum = sum + a;
				cnt++;
				if(cnt>=10) break;
				b = c+a;
				sum = sum + b;
				cnt++;
				if(cnt>=10) break;*/
			}		while(cnt<10);
System.out.println(sum);
}
}
