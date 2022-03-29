package st.bit05.part04;

import java.util.ArrayList;

public class ArrayListTest03 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(10);

        String s1 = new String("홍");
        arrayList.add(s1);
        arrayList.add(new String("길"));
        arrayList.add("님 안녕하세요");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("jdk 추가기능 generic enhanced for loop");

        for (String value : arrayList) {
            System.out.println(value);
        }

        System.out.println("api 확인");
        arrayList.add("길");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("api 확인");
        arrayList.set(3,"홍길순");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("api 확인");
        arrayList.remove(3);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}