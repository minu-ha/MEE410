package ex.g.io.ex08;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Prob {

    public static void main(String[] args) throws Exception{

        int[] array = generateRandomNumber();
        printStatistics(array);
    }

    private static int[] generateRandomNumber() {

        int[] randomsArray = new int[10];

        for (int i = 0; i < 10; i++) {
            randomsArray[i] = (int) (Math.random()*20+1);
            for (int j = 0; j < i; j++) {
                if (randomsArray[i] == randomsArray[j]){
                    i--;
                }
            }
        }

        return randomsArray;
    }

    public static void printStatistics(int[] array) throws Exception{

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/mee410/Desktop/store.txt"));

        int sum = 0;
        int max = 0;
        int min = array[0];

        for ( int distinctRandom : array) {

            sum += distinctRandom;
            max = Math.max(max, distinctRandom);
            min = Math.min(min, distinctRandom);

            bufferedWriter.write(distinctRandom + "\n" );
        }
        bufferedWriter.write((double) sum / 10 + "\n" + max + "\n" + min);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
