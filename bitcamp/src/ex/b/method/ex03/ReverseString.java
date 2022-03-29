package ex.b.method.ex03;

public class ReverseString {

    public char[] reverseString(char[] s, int start, int end) {

        char[] tempCharArr = s.clone();
        char tempChar;

        while (start < end) {
            tempChar = tempCharArr[start];
            tempCharArr[start] = tempCharArr[end];
            tempCharArr[end] = tempChar;
            start++;
            end--;
        }
        return tempCharArr;
    }

    public static void main(String[] args) {
        ReverseString reverseArray = new ReverseString();
        char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.println(reverseArray.reverseString(s, 0, 3));
        System.out.println(reverseArray.reverseString(s, 4, 7));
        System.out.println(reverseArray.reverseString(s, 8, 10));
        System.out.println(reverseArray.reverseString(s, 0, 10));
    }
}
