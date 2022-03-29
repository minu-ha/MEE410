package st.bit06.part02;

public class ExceptionTest01 {

    //field
    private int sum;
    private int avg;

    //constructor
    public ExceptionTest01() {
    }

    //method
    public void sum(int x, int y) {
        sum = x + y;
        System.out.println("합" + sum);
    }

    public void avg(int z) {
        avg = sum / z;
        System.out.println("평균" + avg);
    }

    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest01 et = new ExceptionTest01();
        et.sum(i, j);
        et.avg(k);
    }
}
