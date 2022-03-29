package ex.e.api.ex03;

public class LeftPad {

    public String leftPad(String str, int size, char padChar) {

        int lenght = str.length();

        if (lenght > size) {
            return str;
        }

        String result = "";
        for (int i = 0; i < size - lenght; i++) {
            result += padChar;
        }
        result += str;
        return result;
    }

    public static void main(String[] args) {

        LeftPad ex03 = new LeftPad();

        System.out.println(ex03.leftPad("ABC",6,'#'));
        System.out.println(ex03.leftPad("ABC",5,'$'));
        System.out.println(ex03.leftPad("ABC",2,'&'));
    }
}
