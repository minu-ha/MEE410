package ex.g.io.ex09;

import java.util.Vector;

public class Prob1 {

    public static void main(String[] args) throws Exception {

        String pathName = "/Users/mee410/Desktop/data.txt";

        FileUtil.fileToPrint(pathName);

        System.out.println();
        System.out.println(" search to seoul information in file");

        Vector<User> vector = FileUtil.fileFindAddress(pathName, "서울");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }
    }
}
