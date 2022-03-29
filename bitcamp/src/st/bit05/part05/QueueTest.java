package st.bit05.part05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        String value = new String("홍길동");
        queue.offer(value);
        queue.offer(new String("이순신"));
        queue.offer("주몽");

        String str1 = (String)queue.poll();
        System.out.println(str1);

        String str2 = (String)queue.peek();
        System.out.println(str2);

        while (queue.peek() != null) {
            String str3 = (String)queue.poll();
            System.out.println(str3);
        }
    }
}