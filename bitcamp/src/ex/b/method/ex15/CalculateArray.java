package ex.b.method.ex15;

public class CalculateArray {

    //method
    public void calc(int[] ix){

        int suma = 0;
        int sumb = 0;
        for( int i=0; i<ix.length; i++){
            if( ix[i] % 2 != 0){
                suma += ix[i];
            }else{
                sumb += ix[i];
            }
        }//for end

        System.out.println("홀수의 합 : " + suma);
        System.out.println("짝수의 합 : " + sumb);
    }//method end

    //main
    public static void main(String args[]){
        int[] ia = new int[] {3, 7, 1, 8, 10, 2, 15, 2, 10};
        int[] ib = new int[] {1, 2, 3, 4, 5};

        CalculateArray p = new CalculateArray();
        System.out.println("(배열 ia)");
        p.calc(ia);
        System.out.println("(배열 ia)");
        p.calc(ib);
    }//main end
}//class end