package ex.e.api.ex06;

public class Replace {

    public static String myReplace(String str, char oldChar, char newChar) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result += newChar;
            }else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("----------sample---------");
        String str1 = myReplace("Hello World", 'l', '*');
        System.out.println(str1);

        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("----------sample---------");
        String str2 = myReplace("Hello World", ' ', '-');
        System.out.println(str2);

        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("----------sample---------");
        String str3 = myReplace("Hello World", 'a', '*');
        System.out.println(str3);
    }
}
