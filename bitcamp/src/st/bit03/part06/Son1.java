package st.bit03.part06;

public class Son1 extends st.bit03.part06.Father{

    //field

    //Constructor
    public Son1(){
        System.out.println(this.name);
        System.out.println(bank);
        System.out.println(branch);

        System.out.println(this.getBranch());
        System.out.println(getPassword(0));
    }
}