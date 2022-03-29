package st.bit01.part02;

public class WhileTest {
    public static void main(String[] args) {

        //while
        int i = 0;       //#1 순환문의 조건을 주기위한 int i 초기화
        while( i < 10 ){ //#2 조건 (boolean datatype)
            System.out.println("여기는 while문 내부 i = " +i);
            i++;           //#3 증감식
        }

        //do while
        int j = 0;       //#1 순환문의 조건을 주기위한 int j 초기화
        do{
            System.out.println("\n\t여기는 do문 내부 j = " +j);
            j++;         //#2 증감식
        }while(j<1);     //#3 조건 (boolean datatype)

        System.out.println("\n====================");

        //while 문을 이용하여 5단을 출력하는 프로그램
        int k = 1;
        while(k<10){
            System.out.println( "5 * " + k + " = " + 5*k);
            k++;
        }

        //무한루프와 무한루프 후단의 실행문에서 컴파일 에러 확인
        while (true){
            System.out.println("여기는 반복문내부의 무한루프");
            break;
        }

        //System.out.println("에러 발생 이유 = break; 를 사용하지않았기 때문");
    }
}
