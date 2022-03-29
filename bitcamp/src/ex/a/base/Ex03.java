package ex.a.base;

import java.util.Scanner;

public class Ex03{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.");
        int input = keyboard.nextInt();
        int factorial = 1;

        for( int i = 1; i <= input; i++ ){
            if(input > 9){
                System.out.println(" 잘못된 숫자가 입력되었습니다. ");
                break;
            }
            factorial *= i;
        }
        System.out.println(input + " ! = " + factorial);
    }
}
