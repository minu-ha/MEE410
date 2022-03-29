package st.bit07.part01;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileInputStream fls = null;
        int readCount = 0;

        try {
            fls = new FileInputStream(args[0]);

            while (true) {
                int i = fls.read();

                if (i == -1) {
                    break;
                }

                char c = (char) i;
                System.out.println(c);

                readCount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
        } finally {
            System.out.println("===");
            System.out.println(readCount);
            try {
                fls.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
