package ex.e.api.ex05;

public class ReplaceString {

    private static String replaceString(String[] arr) {

        int sum = 0;
        int max = 0;
        int index = 0;

        String result1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    sum++;
                }
            }

            if (sum >= max) {
                max = sum;
                index = i;
            }
        }
        result1 = arr[index].replace('a', 'A');
        return result1;
    }

    public static void main(String[] args) {
        String[] arr = {"java program", "array", "java program area", "append"};
        String result = ReplaceString.replaceString(arr);
        System.out.println("변경된 문자열" + result);
    }
}
