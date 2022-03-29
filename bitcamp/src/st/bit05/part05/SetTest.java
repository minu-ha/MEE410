package st.bit05.part05;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();

        String str = new String("a");
        boolean isAddOk = hs.add(str);
        System.out.println(isAddOk);

        isAddOk = hs.add("b");
        System.out.println(isAddOk);

        isAddOk = hs.add("B");
        System.out.println(isAddOk);

        isAddOk = hs.add("B");
        System.out.println(isAddOk);

        System.out.println(hs.size());
        if (hs.contains("b")) {
            System.out.println("데이터 b삭제");
            hs.remove("b");
        }
        System.out.println(hs.size());
    }
}