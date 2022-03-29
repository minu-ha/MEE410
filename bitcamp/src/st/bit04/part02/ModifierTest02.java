package st.bit04.part02;

class  TopSecret02{

    //field
    private final int secretNo = 7777;

    //constructor
    public TopSecret02(){
    }

    //method - getter
    public int getSecretNo( int pwd ){
        if ( pwd == 0){
            return secretNo;
        }else{
            return 0;
        }
    }
}

public class ModifierTest02{

    //main method
    public static void main(String[] args){

        TopSecret02 topSecret = new TopSecret02();
        System.out.println(topSecret.getSecretNo(0));
    }
}