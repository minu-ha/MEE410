package ex.b.method.ex13;

public class Util{

    int count = 0;
    boolean prime = false;

    public int findPrimeCount(int limit){

        for(int i = 2; i <= limit; i++){
            prime = true;
            for( int j = 2; j < i; j++){
                if( i % j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                count++;
            }
        }
        return count;
    }

    public int[] findPrimeReturnArray(int limit){

        int[] arr = new int[count];

        int p = 0;
        for(int i = 2; i <= limit; i++){
            prime = true;
            for( int j = 2; j < i; j++){
                if( i % j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                arr[p] = i;
                p++;
            }
        }
        return arr;
    }
}

