package st.bit01.part02;

public class ForTest {
    public static void main(String[] args) {

        int j = 5;
        System.out.println( j + "단을 출력합니다.");

        // for 문은 while 문과는 달리 초기화를 for 문 내부에서 한다.
        for ( int i = 1; i < 10; i++ ){
            System.out.println( j + " * " + i + " = " + j*i );
        }

        // // 반복문 for / while 사용과 차이점 이해
        // int k = 1;
        // while( k < 10){
        //     System.out.println( "5 * " + k + " = " + 5*k );
        //     k++;
        // }

        // System.out.println("i의 최종변경 값 = " + i);
        // System.out.println("k의 최종변경 값 = " + k);

        // 무한루프와 무한루프 후단의 실행문에서 컴파일 에러를 이해하기
        for( ; ; ){
            System.out.println("여기는 반복문 내부의 무한루프");
        }

        // 초기값 , 조건식 , 증감식을 쓰지 않았기 때문이다.
    }
}
