package st.bit07.part01;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {
    public static void main(String[] args) {

        System.out.println("insert filename");

        String name = "";

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            name = in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File(name);

        if (file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(file.length());
        } else {
            System.out.println("file is not exist");

        }
    }
}
