package st.bit06.part01;


public class OuterClass01 {

    //field
    private final String outer = "field of OuterClass";

    //constructor
    public OuterClass01() {
    }

    //method
    public void outerMethod() {
        System.out.println(this.getClass().getName());

        InnerClass ic = new InnerClass();
        ic.innerMethod();
        System.out.println(this.getClass().getName());
    }

    public class InnerClass{

        //field
        private final String inner = "field of innerClass";

        //constructor
        public InnerClass() {
        }

        //method
        public void innerMethod() {
            System.out.println(this.getClass().getName());
            System.out.println(outer);
            System.out.println(OuterClass01.this.outer);
            System.out.println(inner);
            System.out.println(this.getClass().getName());

        }
    }

    //main
    public static void main(String[] args) {
        new OuterClass01().outerMethod();
    }
}
