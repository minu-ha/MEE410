package st.bit06.part01;

    class A{
        public void abc(String message) {
            System.out.println(getClass().getName());
            System.out.println(message);
            System.out.println(getClass().getName());
        }

        public class AnonymousInnerClass{
            public static void main(String[] args) {

                A a = new A();
                a.abc("hi");

                new A().abc("hi");

                new A() {
                    public void def(String message) {
                        System.out.println(this.getClass().getName());
                        System.out.println(message);
                    }
                }.abc("hi");

                new A() {
                    public void def(String message) {
                        System.out.println(this.getClass().getName());
                        System.out.println(message);
                    }
                }.def("hi");
            }
        }
    }


