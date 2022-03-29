package st.bit05.part01;

public class CallByValueTest {

    //field
    int number = 0;

    //method
    public void valueChange(int value){
        value = value + 100;
        System.out.println("value : " + value);
    }

    //main method
    public static void main(String[] args) {

        CallByValueTest call = new CallByValueTest();

        call.valueChange(call.number);
        System.out.println("number : " + call.number);
    }
}