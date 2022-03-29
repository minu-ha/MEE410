package ex.e.api.ex01;

public class Encoding {

    public static void main(String[] args){

        String sourceString = " everyday we have is one more than we deserve";
        String encodedString = "";

        for( int i = 0; i < sourceString.length(); i++){
            char currentChar = sourceString.charAt(i);
            if(currentChar == ' '){
                encodedString += ' ';
            }else if (currentChar == 'x' || currentChar == 'y' || currentChar == 'z'){
                encodedString += (char)(currentChar-23);
            }else{
                encodedString += (char)(currentChar+3);
            }
        }



        System.out.println("암호화할 문자열 " + sourceString);
        System.out.println("암호화된 문자열 " + encodedString);
    }
}