package ex.a.base;

public class Ex02{
    public static void main(String[] args){

        int limit = 50;
        boolean prime = false;

        int i = 2;
        while ( i <= limit ){
            prime = true;

            for( int j =2; j < i; j++){
                if( i % j == 0){
                    prime = false;
                    System.out.println(prime);
                }
            }
            if(prime){
                System.out.println(i);
            }
            i++;
        }
    }
}