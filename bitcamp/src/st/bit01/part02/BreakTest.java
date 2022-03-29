package st.bit01.part02;

import java.util.Scanner;

public class BreakTest {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        //입력받은 data를 int로 변환
        //int inputData = Integer.parseInt(args[0]);
        int inputData = sc.nextInt();

        //while문의 초기화변수 선언
        int i = 0;

        //더한값을 저장하기 위한 변수선언
        int sum = 0;

        while(true){
            i++;
            sum = sum + i;

            if( i == inputData){
                break;
            }
        }

        System.out.println("0 ~ " + inputData + " 까지의 합은 " + sum + " 입니다. ");

    }
}