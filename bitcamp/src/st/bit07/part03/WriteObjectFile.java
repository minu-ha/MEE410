package st.bit07.part03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectFile {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("userinfo"));

        oos.writeObject(new UserVO(1, "홍길동"));
        oos.writeObject(new UserVO(2, "홍길순"));
        oos.flush();
        oos.close();
    }
}
