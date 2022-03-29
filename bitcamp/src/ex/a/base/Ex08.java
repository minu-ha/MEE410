package ex.a.base;

public class Ex08 {

    //method
    public void print(String star, int startCount, int count){

        if(startCount != count){
            for ( int i=0; i<(startCount-count)/2; i++){
                System.out.print(" ");
            }
        }

        for( int i=0;i<count; i++){
            System.out.print(star);
        }

        System.out.print("\n");

        if(count-2 > 0){
            print(star, startCount, count-2);
        }
    }

    //main
    public static void main(String args[]){

        if(args.length != 1){
            System.out.println(" 수를 입력하세요 ");
            return;
        }

        int count = Integer.parseInt(args[0]);
        int startCount = count;

        if( count  <= 0 || count % 2 == 0){
            System.out.println("0보다 큰 홀수만 입력 가능합니다.");
        }

        Ex08 star = new Ex08();
        star.print("*", startCount, count);
    }
}