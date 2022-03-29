package st.bit03.part06;

public class Son extends Father{

    //field

    //Constructor
    public Son(){
        System.out.println(this.name);
        System.out.println(bank);
        System.out.println(branch);

        System.out.println("은행 비밀번호 :" + this.getPassword(0));
    }
}