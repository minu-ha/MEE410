package ex.a.base;

public class Ex06 {
    public static void main(String[] args){

        int[] array = { 3, 24, 1, 55, 17, 43, 5};
        int temp;

        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }
    }//eom
}//eos