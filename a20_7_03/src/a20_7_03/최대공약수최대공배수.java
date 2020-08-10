package a20_7_03;
public class 최대공약수최대공배수 {
public static void main(String[] args) {
int a=4, b=6, GCD, LCM, small;

small=(a>b)?b:a;

for(GCD=small;GCD>=1;GCD--) {
	if(a%GCD==0 && b%GCD==0) break;
}
System.out.println(GCD);

///////////////////////////////////////////////////
for (LCM=small; LCM<=a*b; LCM++) {
	if(LCM%a==0 && LCM%b==0) break;
}
System.out.println(LCM);
}
} 
