package 개인;

import java.util.Scanner;

public class 지식인 {
    public static void main(String[] args) {
    	   
        //[1] 준비
        int S[] = new int[20]; //소인수 분해한 결과를 저장할 배열
        Scanner sc = new Scanner(System.in);
        int N = 0; // 단계별로 소인수 분해할 수로 첫 단계는 입력받은값
        int K = 2; //N을 나누어 보는수
        int C = 0; //소인수 계산 처리를 위한 변수
        int Y = 1; //소인수 분해한 결과를 출력할 때 사용할 배열 첨자
       
        //[2] 처리
       
        N = sc.nextInt();
        do{
           
            if(N<2){ //2보다 작으면 스톱
                System.out.println("Exit");
                break;
            }
       
            C = 0;
            do{
                K = 2;
                while(N%K!=0){
                    K = K+1;           
                }
                C=C+1;
                S[C] = K;
                N = (int)N/K;
               
            }while(N!=1);
           
            if(C == 1){
                System.out.println("소수");
            }else{         
                for(Y=1;Y<=C-1;Y++){
                    System.out.print(S[Y]+" X ");
                }
                System.out.println(S[C]);              
            }
       
        }while(true);
       
        //[3] 출력
       
    }
}
