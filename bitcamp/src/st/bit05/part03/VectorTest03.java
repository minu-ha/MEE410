package st.bit05.part03;

import java.util.*;

public class VectorTest03 {


    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(10, 10);

        String s1 = new String("홍");
        vector.add(s1);
        vector.add(new String("동"));
        vector.add("님 안녕");

        for( int i=0; i<vector.size(); i++) {
            String s = vector.elementAt(i);
            System.out.print(s);
        }

        System.out.println("generic, Enhanced for loop" );
        for(String value : vector) {
            System.out.print(value);
        }


        System.out.println("api 확인");
        vector.insertElementAt("길", 1);
        for( int i=0; i<vector.size(); i++) {
            System.out.print(vector.elementAt(i));
        }

        System.out.println("api 확인");
        vector.setElementAt("홍길순", 3);
        for( int i=0; i<vector.size(); i++) {
            System.out.print(vector.elementAt(i));
        }

        System.out.println("api 확인");
        vector.removeElementAt(3);
        for( int i=0; i<vector.size(); i++) {
            System.out.print(vector.elementAt(i));
        }
    }
}