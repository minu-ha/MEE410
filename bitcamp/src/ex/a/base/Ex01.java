package ex.a.base;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.");
        int input = keyboard.nextInt();


        for( int i = 2; i < 10; i++ ){
            if( input < 1 || input > 9){
                System.out.println(" 잘못된 숫자가 입력되었습니다. ");
                break;
            }
            System.out.println(input + " * " + i + " = " + input*i );
        }
        System.out.println("\n");
    }
}