package st.bit07.part01;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    //main method
    public static void main(String[] args) {

        //file 읽어들이는 stream 선언
        FileReader fr = null;
        int readCount = 0;

        try {
            fr = new FileReader(args[0]);

            while (true) {
                int i = fr.read();

                if (i == -1) {
                    break;
                }

                char c = (char) i;
                System.out.print(c);

                readCount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            System.out.println(readCount);
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
