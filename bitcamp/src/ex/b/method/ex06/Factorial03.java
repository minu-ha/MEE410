package ex.b.method.ex06;

import java.util.Scanner;

public class Factorial03 {

    //method
    public int factorial(int n){

        int result = 0;

        if( n > 0 ){
            result = ( n*factorial(n-1));
            return result;
        }else{
            return 1;
        }
    }//method end

    //main
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("input =");

        Factorial03 util = new Factorial03();
        System.out.print("result = " + util.factorial(keyboard.nextInt()));
    }//main end
}//class end