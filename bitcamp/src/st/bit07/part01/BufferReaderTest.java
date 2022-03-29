package st.bit07.part01;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {
    public static void main(String[] args) throws Exception {

        int readCount = 0;

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        //BufferedReader brf = new BufferedReader(new FileReader(args[0]));

        String oneLine;

        while (true) {

            readCount++;

            oneLine = br.readLine();
            if (oneLine == null) {
                break;
            }
            System.out.println("oneLine print" + readCount + oneLine);
        }
        br.close();
        fr.close();
    }
}
