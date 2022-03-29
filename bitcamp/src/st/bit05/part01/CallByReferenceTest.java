package st.bit05.part01;

public class CallByReferenceTest {

    //field
    int number = 100;

    //method
    public void referenceChange(CallByReferenceTest value){
        value.number = 100 + value.number;
        System.out.println("number : " + value.number);
    }

    //main Method
    public static void main(String[] args) {

        CallByReferenceTest call = new CallByReferenceTest();

        call.referenceChange(call);
        System.out.println("call number : " + call.number);
    }

}