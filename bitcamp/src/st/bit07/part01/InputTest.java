package st.bit07.part01;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {

        InputStream inputStream = System.in;

        System.out.println("입력을 기다립니다");

        try {
            while (true) {

                // java.io는 지연될 수 있다
                int i = inputStream.read();
                char c = (char) i;

                System.out.println("input value" + c);

                if (c == 'x') {
                    inputStream.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
