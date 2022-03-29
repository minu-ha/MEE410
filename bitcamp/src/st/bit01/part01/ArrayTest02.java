package st.bit01.part01;

public class ArrayTest02 {
    public static void main(String args[]) {

        //int Data Type의 2차 배열을 생성
        int[][] value = new int[9][9];

        //index를 이용하여 value 값 접근 및 대입
        for( int i = 0; i < 9; i++){
            value[0][i] = 1 * ( i + 1 );
        }

        //입력된 값을 출력
        //value.length / value[j].length 이해하기
        //그 이외의 값들은 자동 초기화된다

        for( int j = 0; j < value.length; j++){
            System.out.println("==============");

            for( int k = 0; k < value[j].length; k++){
                System.out.println("value[" + j + "][" + k + "] = " + value[j][k]);
            }//end of inner
        }//end of outer
    }//end of main
}//end of class