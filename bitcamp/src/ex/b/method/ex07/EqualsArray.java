package ex.b.method.ex07;

public class EqualsArray {

    private static boolean equalsArr(int[] a, int[] b){

        if( a.length != b.length ){
            return false;
        }

        for( int i = 0; i < a.length; i++ ){
            if( a[i] != b[i] ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        int[] arr1 = {3, 5, 6, 9, 10, 2, 7};
        int[] arr2 = {3, 5, 6, 9, 10, 2, 7};

        if(equalsArr(arr1, arr2)){
            System.out.println("Two array equals");
        }else{
            System.out.println("Two array not equals");
        }
        System.out.println();

        int[] arr3 = {3, 5, 6, 9};
        int[] arr4 = {3, 5, 6, 9, 8};

        if(equalsArr(arr3, arr4)){
            System.out.println("Two array equals");
        }else{
            System.out.println("Two array not equals");
        }
    }
}