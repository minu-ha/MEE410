package ex.e.api.ex08;

public class StringSplit {

    private static String[] stringSpilt(String str1, String str2) {

        int count = 1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                count++;
            }
        }

        String[] strArray = new String[count];
        String str = "";
        int arrayCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                strArray[arrayCount] = str;
                str = "";
                arrayCount++;
            } else {
                str = str + str1.charAt(i);
            }
        }

        strArray[arrayCount] = str;
        return strArray;
    }

    public static void main(String[] args) {

        String str = "PROD-001#X-note#Samnsung#3#6000000";
        String[] strs = stringSpilt(str, "#");
        System.out.println("문자열 처리결과");
        for (String s : strs) {
            System.out.println(s);
        }
    }
}
