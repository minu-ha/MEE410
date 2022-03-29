package st.bit04.part01;

public class ObjectTest{

    //field
    int i;
    static int j;

    //static block
    static{
        System.out.println(" a > : j = " + j);
        j =1 ;
        System.out.println(" b > : j = " + j);
    }

    //constructor
    public ObjectTest(){
        System.out.println("objecttest default constructor : c > : i =" + i);
    }

    //method (instance method)
    public void printInstanceInt(){
        System.out.println(" d > : i = " + i);
    }

    //static method ( or class method )
    public static void printClassInt(){
        System.out.println("  e > : j = " + j);
    }

    //main method
    public static void main(String args[]){

        System.out.println();
        ObjectTest obj1 = new ObjectTest();
        obj1.printInstanceInt();
        obj1.printClassInt();
        System.out.println();
        ObjectTest.printClassInt();
    }
}