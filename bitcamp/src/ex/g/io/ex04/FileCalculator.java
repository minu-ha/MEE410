package ex.g.io.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Vector;

public class FileCalculator {

    public void addCalculateResult(String inputFileName) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
        String temp = null;

        List<Integer> values = new Vector<>();

        while ((temp = bufferedReader.readLine()) != null) {

            if (temp.length() == 0) {
                break;
            }
            values.add(Integer.parseInt(temp));
        }

        bufferedReader.close();

        int sum = 0;
        int multiple = 1;
        for (int tempVal : values) {
            sum += tempVal;
            multiple *= tempVal;
        }

        values.add(sum);
        values.add(multiple);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFileName));

        for (int tempVal : values) {
            bufferedWriter.write(tempVal+"\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();

    }

    public static void main(String[] args) throws Exception {

        FileCalculator fileCalculator = new FileCalculator();
        fileCalculator.addCalculateResult("/Users/mee410/Desktop/fstFile1.txt");
    }
}
