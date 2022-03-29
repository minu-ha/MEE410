package ex.e.api.ex02;

public class Adder {
    public int execute(String expr) {

        int result = 0;
        String strNum = "";

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '+') {
                result += Integer.parseInt(strNum);
                strNum = "";
            } else {
                strNum += c;
            }
        }
        return (result + Integer.parseInt(strNum));
    }
}