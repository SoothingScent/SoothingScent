package a20_6_26;
//교환
public class ch02ex05 {
public static void main(String[] args) {
int a , b, c;
a=10; b=20;
System.out.println(a+","+b);
c=a;    //a를 c에 덮어쓰기
a=b;    //b를 a에 덮어쓰기
b=c;    //c를 b에 덮어쓰기
System.out.println(a+","+b);
}
}
