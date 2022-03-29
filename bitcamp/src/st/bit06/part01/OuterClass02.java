package st.bit06.part01;

public class OuterClass02 {
    //field
    private String outer = "field of OuterClass";

    //constructor
    public OuterClass02() {
    }

    //method
    public void outerMethod() {
        System.out.println(this.getClass().getName());

        final String localVariable = "inside of localVariable of outerMethod";

        //inner local class
        class InnerLocalClass{
            private String inner = " field of inner";

            public InnerLocalClass() {
            }

            public void innerMethod() {

                System.out.println(this.getClass().getName());
                System.out.println(localVariable);
                System.out.println(outer);
                System.out.println(inner);
                System.out.println(this.getClass().getName());

            }
        }
        System.out.println(this.getClass().getName());

        InnerLocalClass ilc = new InnerLocalClass();
        ilc.innerMethod();
    }

    //main
    public static void main(String[] args) {
        new OuterClass02().outerMethod();
    }
}
