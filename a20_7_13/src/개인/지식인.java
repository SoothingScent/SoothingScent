package ����;

import java.util.Scanner;

public class ������ {
    public static void main(String[] args) {
    	   
        //[1] �غ�
        int S[] = new int[20]; //���μ� ������ ����� ������ �迭
        Scanner sc = new Scanner(System.in);
        int N = 0; // �ܰ躰�� ���μ� ������ ���� ù �ܰ�� �Է¹�����
        int K = 2; //N�� ������ ���¼�
        int C = 0; //���μ� ��� ó���� ���� ����
        int Y = 1; //���μ� ������ ����� ����� �� ����� �迭 ÷��
       
        //[2] ó��
       
        N = sc.nextInt();
        do{
           
            if(N<2){ //2���� ������ ����
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
                System.out.println("�Ҽ�");
            }else{         
                for(Y=1;Y<=C-1;Y++){
                    System.out.print(S[Y]+" X ");
                }
                System.out.println(S[C]);              
            }
       
        }while(true);
       
        //[3] ���
       
    }
}
