package ex.g.io.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

    public void printGrade(String fileName){

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            int total = 0;
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] token = line.split(",");
                int score = Integer.parseInt(token[1]);
                total += score;
                System.out.println(token[0] + "'s grade" + score);
                count++;
            }

            System.out.println(" total of all of them " + total);
            System.out.println(" avg of all of them " + total / count);
        } catch (Exception exception) {
            System.out.println(exception);
        }finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static void main(String[] args) {

        Grade grade = new Grade();
        String fileName = "score.txt";
        grade.printGrade(fileName);

    }
}
