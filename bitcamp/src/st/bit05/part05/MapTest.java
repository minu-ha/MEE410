package st.bit05.part05;

import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        String key = new String("홍");
        String value = new String("의적");
        map.put(key, value);

        map.put("이순신", "수군 대장군");
        map.put("주몽", "고구려시조");

        String value01 = map.get("주몽");
        System.out.println("주몽 설명" + value01);

        if (map.containsKey("이순신")) {
            System.out.println("이순신을 키로 갖는 값이 있으며" + map.get("이순신"));
        }

        if (map.containsKey("김유신")) {
            System.out.println("김유신을 키로 갖는 값이 있으며" + map.get("김유신"));
        }

        if (map.containsKey("의적")) {
            System.out.println("의적을 밸류로 갖는 데이터가 있습니다");
        }
    }
}