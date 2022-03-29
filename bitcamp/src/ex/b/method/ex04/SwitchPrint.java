package ex.b.method.ex04;

public class SwitchPrint {

    //method
    public void printSeason(int m){

        String inputMonth = "";
        String invalidMonth = "";

        switch( m ){
            case 1: inputMonth = "겨울";
                break;
            case 2: inputMonth = "겨울";
                break;
            case 3: inputMonth = "봄";
                break;
            case 4: inputMonth = "봄";
                break;
            case 5: inputMonth = "봄";
                break;
            case 6: inputMonth = "여름";
                break;
            case 7: inputMonth = "여름";
                break;
            case 8: inputMonth = "여름";
                break;
            case 9: inputMonth = "가을";
                break;
            case 10: inputMonth = "가을";
                break;
            case 11: inputMonth = "가을";
                break;
            case 12: inputMonth = "여름";
                break;
            default : invalidMonth = " 1-12사이의 수를 입력하세요.";
        }
        System.out.println(inputMonth + "에 태어나셨네요.");
        System.out.println(invalidMonth);
    }

    //main method
    public static void main(String[] args){
        int month = Integer.parseInt(args[0]);

        //new Prob08().printSeason(month);

        new SwitchPrint().printSeason(month);

        SwitchPrint ps = new SwitchPrint();
        ps.printSeason(month);
    }
}