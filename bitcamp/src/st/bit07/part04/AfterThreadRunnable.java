package st.bit07.part04;

public class AfterThreadRunnable implements Runnable{

    //field
    private String name;

    //constructor
    public AfterThreadRunnable(String name) {
        this.name = name;
    }

    //method

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(name + ":" + i);
        }
        /*
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
         */
    }

    public static void main(String[] args) {

        AfterThreadRunnable bt1 = new AfterThreadRunnable("first");
        AfterThreadRunnable bt2 = new AfterThreadRunnable("second");

        Thread t1 = new Thread(bt1);
        Thread t2 = new Thread(bt2);

        t1.start();
        t2.start();
        System.out.println("end");

    }
}

