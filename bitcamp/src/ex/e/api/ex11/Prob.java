package ex.e.api.ex11;

public class Prob {

    public String toEncoding(String str) {

        StringBuilder sbuf = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {

            int code = str.codePointAt(i);

            if (code < 128) {
                sbuf.append(String.format("%c", code));
            } else {
                sbuf.append("%").append(Integer.toHexString(code));
            }

        }
        return sbuf.toString();
    }

    public static void main(String[] args) {

        Prob p1 = new Prob();

        System.out.println("입력 : Korea");
        System.out.println("출력 : " + p1.toEncoding("Korea"));

        System.out.println("입력 : 홍길동");
        System.out.println("출력 : " + p1.toEncoding("홍길동"));

        System.out.println("입력 : 홍 길 동");
        System.out.println("출력 : " + p1.toEncoding("홍 길 동"));

        System.out.println("입력 : Hong 길 동");
        System.out.println("출력 : " + p1.toEncoding("Hong 길 동"));

        System.out.println("입력 : 0319");
        System.out.println("출력 : " + p1.toEncoding("0319"));

    }
}
