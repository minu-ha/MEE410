package st.bit06.part02;

public class ExceptionTest02 {

    //field
    private int sum;
    private int avg;

    //constructor
    public ExceptionTest02() {
    }

    //method
    public void sum(int x, int y) {
        sum = x + y;
        System.out.println("합" + sum);
    }

    public void avg(int z) {

        try {
            avg = sum / z;
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println(avg);
    }

    //main
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest02 et = new ExceptionTest02();
        et.sum(i, j);
        et.avg(k);
    }
}
