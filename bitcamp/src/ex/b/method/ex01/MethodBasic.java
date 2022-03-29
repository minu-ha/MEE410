package ex.b.method.ex01;

public class MethodBasic {

    //method
    public int abs( int num1, int num2){
        int result = 0;
        result = num1 - num2;

        if( result < 0 ){
            return result*-1;
        }

        return result;
    }

    //main
    public static void main( String args[] ){
        int num1 = 6;
        int num2 = 15;

        MethodBasic prob = new MethodBasic();
        System.out.println("두 수의 차는 " + prob.abs(num1,num2));
    }

}
