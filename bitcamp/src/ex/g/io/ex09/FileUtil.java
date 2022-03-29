package ex.g.io.ex09;

import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileUtil {
    public static void fileToPrint(String fileName) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String string = bufferedReader.readLine();

        while (string != null) {
            System.out.println(string);
            string = bufferedReader.readLine();
        }
    }

    public static Vector<User> fileFindAddress(String fileName, String address) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] strings;
        String string;
        User user;

        Vector<User> vector = new Vector<>();
        while ((string = bufferedReader.readLine()) != null) {

            user = new User();
            strings = string.split("/");

            if (strings[1].equals(address)) {

                user.setName(strings[0]);
                user.setAddress(strings[1]);
                user.setCellularNumber(strings[2]);
                user.setMale(Boolean.parseBoolean(strings[3]));

                vector.add(user);
            }
        }
        return vector;
    }
}
