package ex.b.method.ex05;

public class Ascending {

    public int[] ascending(int[] inputNumbers){

        int temp = 0;
        for(int i = 0; i < inputNumbers.length; i++) {
            for(int j = i+1; j < inputNumbers.length; j++) {
                if(inputNumbers[i] > inputNumbers[j]) {
                    temp = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = temp;
                }
            }
        }
        return inputNumbers;
    }

    public static void main(String[] args){

        Ascending util = new Ascending();
        int[] numbers = new int[] {8,5,2,19,34,51,32,11,67,21};

        numbers = util.ascending(numbers);

        for( int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);

            if( i != numbers.length-1){
                System.out.print(",");
            }else{
                System.out.println();
            }
        }
        System.out.println("Successfull!");
    }
}
