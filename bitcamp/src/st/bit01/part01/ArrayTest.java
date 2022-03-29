package st.bit01.part01;

public class ArrayTest {
    public static void main(String args[]) {

        //1.int Data Type Array 선언  int[] intArray;
        //2.9개의 int를 저장 할 수 있는 공간을 갖는 배열 생성 new int[9]
        //3.대입 연산자 = 를 이용하여 대입변수에 9개 공간의 위치정보 대입 i = new int[9];
        //4.배열 선언, 생성, 위치정보 대입을 동시에 int[] intArray = new int[9];
        //5.각 위치에 값 대입

        int[] intArray = new int[9];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;
        intArray[7] = 8;
        intArray[8] = 9;

        //array 선언과 동시에값을 대입하는 방법
        //int[] intArray = { 1, 2, 3, 4, 5};
        //int[] intArray = new int[] { 1, 2, 3, 4, 5};

        //배열의 index를 이용하여 각각의 값에 접근하기

        for( int j = 0; j < 9; j++){
            System.out.println( " intArray[" + j + "]값은 : " + intArray[j]);
        }


        //값을 이용하여 5단을 출력. intArray.length
        //Operator와 length keyword 사용
        System.out.println("======================");
        for( int k = 0; k < intArray.length; k++){
            System.out.println( "5 X " + intArray[k] + " = " + 5*intArray[k]);
        }

        //출력내용 이해하기 ( primitive int i = 0; 과 비교)
        int[] j = intArray;
        System.out.println("======================");
        System.out.println("j[0]의 값은 : " + j[0]);
        System.out.println("j[5]의 값은 : " + j[5]);

        //출력결과 확인하기
        j[5] = 1234;
        System.out.println("j[5] ==> " + j[5]);
        System.out.println("i[5] ==> " + intArray[5]);
    }
}