package st.bit04.part02;

final class  TopSecret04{

    //field
    private final int secretNo = 7777;

    //constructor
    public TopSecret04(){
    }

    //method - getter
    public int getSecretNo( int pwd ){
        if ( pwd == 0){
            return secretNo;
        }else{
            return 0;
        }
    }

    //static method
    public static TopSecret04 getInstance(int managerNo){
        if( managerNo == 1234 ){
            return new TopSecret04();
        }else{
            return null;
        }
    }
}

public class ModifierTest04{

    //main method
    public static void main(String args[]){
        TopSecret04 topSecret = TopSecret04.getInstance(1234);
        System.out.println(topSecret.getSecretNo(0));
    }
}