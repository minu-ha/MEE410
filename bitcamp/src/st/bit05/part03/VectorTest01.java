package st.bit05.part03;

import java.util.*;

public class VectorTest01 {
    public static void main(String[] args) {

        Vector vector = new Vector(10,10);

        String s1 = new String("홍");
        vector.add(s1);
        vector.add(new String ("동"));
        vector.add("님 안녕하세요.");

        for( int i=0; i<vector.size(); i++) {
            Object obj = vector.elementAt(i);
            String s = (String)obj;
            System.out.print(s);
        }

        System.out.println("api 확인");
        vector.insertElementAt("길", 1);
        for( int i=0; i<vector.size(); i++) {
            System.out.println((String)vector.elementAt(i));
        }
        System.out.println("api 확인");
        vector.insertElementAt("홍길순", 3);
        for( int i=0; i<vector.size(); i++) {
            System.out.println((String)vector.elementAt(i));
        }
        System.out.println("api 확인");
        vector.removeElementAt(3);
        for( int i=0; i<vector.size(); i++) {
            System.out.println((String)vector.elementAt(i));
        }
    }
}