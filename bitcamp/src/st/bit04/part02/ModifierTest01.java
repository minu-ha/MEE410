package st.bit04.part02;

class  TopSecret01{

    //field
    int secretNo = 7777;

    //constructor
    public TopSecret01(){
    }

    //method - getter
    public int getSecretNo(){
        return secretNo;
    }
}

public class ModifierTest01{

    //main method
    public static void main(String args[]){

        TopSecret01 topSecret = new TopSecret01();
        System.out.println(topSecret.secretNo);

        topSecret.secretNo = 1234;
        System.out.println(topSecret.secretNo);
    }
}