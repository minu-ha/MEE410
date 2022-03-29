package ex.g.io.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

public class FileController {

    public void reverseLine(String oldf, String newf) throws Exception {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newf));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(oldf));
        Vector<String> stringVector = new Vector<>(1, 1);
        String fileRead;

        while (true) {

            fileRead = bufferedReader.readLine();

            if (fileRead == null) {
                break;
            }
            stringVector.add(fileRead);
        }
        for (int i = stringVector.size()-1; i >= 0; i--) {
            bufferedWriter.write(stringVector.elementAt(i) + "\n");
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void main(String[] args) throws Exception {

        FileController c = new FileController();
        String oldf = "oldf.txt";
        String newf = "newf.txt";
        c.reverseLine(oldf, newf);
    }
}
