package st.bit06.part03;

class FindOddException extends Exception {

    //field

    //constructor
    public FindOddException() {
    }

    public FindOddException(String message) {
        super(message);
    }
}

public class FindOddExceptionTest {

    //field

    //constructor

    public FindOddExceptionTest() {
    }

    //method
    public void test(int number) throws FindOddException {

        System.out.println(" :: " + this.getClass().getName() + " start");
        if (number % 2 == 0) {
            System.out.println(number);
        }else{
            throw new FindOddException();
        }

        System.out.println(" :: " + this.getClass().getName() + " end");
    }

    //main
    public static void main(String[] args) {
        FindOddExceptionTest met = new FindOddExceptionTest();
        try {
            met.test(10);
            met.test(11);
        } catch (FindOddException e) {
            System.out.println(e);
        }
    }
}