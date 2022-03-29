package st.bit04.part04;

public class HanmiBank extends Bank implements Deposit,PayOut{

    public HanmiBank(String name){
        super(name);
    }

    //method
    public void display(){
        System.out.println("은행명 : "+ this.getName());
    }
    public void deposit(int money){
        System.out.println(money + "를 입급함니다. ");
    }
    public void payOut(int money){
        System.out.println(money + "를 입급함니다. ");
    }


    //main
    public static void main(String[] args){

        HanmiBank hb = new HanmiBank("한미은행");
        hb.display();
        hb.deposit(100);
        hb.payOut(200);


        System.out.println(deposit);
        System.out.println(hb.payOut);
    }
}