package st.bit05.part03;

import java.util.*;

public class VectorTest02 extends Vector {

    public VectorTest02() {
        super();
    }

    public VectorTest02(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }


    public void pringString(Vector vector) {
        for(Object object : vector) {
            System.out.print((String)object);
        }
    }

    public static void main(String[] args) {

        VectorTest02 vectorTest = new VectorTest02(10,10);

        String s1 = new String("홍");
        vectorTest.add(s1);
        vectorTest.add(new String("동"));
        vectorTest.add("님 안녕하세요");

        vectorTest.pringString(vectorTest);

        System.out.println("api 확인");
        vectorTest.insertElementAt("길", 1);
        vectorTest.pringString(vectorTest);


        System.out.println("api 확인");
        vectorTest.setElementAt("홍길순", 3);
        vectorTest.pringString(vectorTest);


        System.out.println("api 확인");
        vectorTest.removeElementAt(3);
        vectorTest.pringString(vectorTest);

    }
}