package st.bit07.part03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFile {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("userinfo"));

        UserVO user01 = (UserVO) ois.readObject();
        UserVO user02 = (UserVO) ois.readObject();

        System.out.println(user01);
        System.out.println(user02);

        ois.close();
    }
}
