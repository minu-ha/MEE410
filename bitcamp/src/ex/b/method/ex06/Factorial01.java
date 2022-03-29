package ex.b.method.ex06;

import java.util.Scanner;

public class Factorial01 {

    //method
    public int factorial(int input) {

        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
    return factorial;
    }

        //method end

        //main
        public static void main (String args[]){

            Scanner keyboard = new Scanner(System.in);
            System.out.print("input =");

            Factorial03 util = new Factorial03();
            System.out.print("result = " + util.factorial(keyboard.nextInt()));
        }
        //main end
}
//class end

