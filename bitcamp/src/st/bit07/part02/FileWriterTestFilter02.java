package st.bit07.part02;

import java.io.*;

public class FileWriterTestFilter02 {

    public static void main(String[] args) throws Exception {

        BufferedReader br;
        BufferedWriter bw;

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new FileWriter("test.txt"));

        System.out.println("input a String to save your file");

        while (true) {
            String str = br.readLine();
            if (str.equals("over")) {
                break;
            }
            bw.write(str, 0, str.length());
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
