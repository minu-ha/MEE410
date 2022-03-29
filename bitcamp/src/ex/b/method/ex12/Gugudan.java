package ex.b.method.ex12;

public class Gugudan {

    public static void printGugudan(int no){

        if( no < 1 || no > 9 ){
            System.out.println("1이상 9이하의 값을 입력하셔야 합니다.");
            return;
        }

        for( int i=1; i<=10; i++){
            for( int j=1; j<=no; j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        System.out.println("주어진 숫자까지의 구구단을 찍습니다");
        System.out.println("-----------sample 1-------------");
        printGugudan(4);

        System.out.println("주어진 숫자까지의 구구단을 찍습니다");
        System.out.println("-----------sample 1-------------");
        printGugudan(9);

        System.out.println("주어진 숫자까지의 구구단을 찍습니다");
        System.out.println("-----------sample 1-------------");
        printGugudan(-1);

        System.out.println("주어진 숫자까지의 구구단을 찍습니다");
        System.out.println("-----------sample 1-------------");
        printGugudan(10);
    }

}