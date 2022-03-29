package st.bit07.part04;

public class PriorityThread extends Thread {

    //field
    private String name;

    //constructor
    public PriorityThread(String name) {
        this.name = name;
    }

    //method

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + "print");
        }
    }

    public String getThreadName() {
        return name;
    }

    //main
    public static void main(String[] args) {

        PriorityThread p1, p2, p3;

        p1 = new PriorityThread("1.Max");
        p2 = new PriorityThread("2.NORM");
        p3 = new PriorityThread("3.MIN");

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MIN_PRIORITY);

        p3.start();
        p2.start();
        p1.start();

        System.out.println(" :: Main Thread 1EA + Thread 3EA");

        System.out.println(" :: " + p1.getThreadName() + " priority of Thread : " + p1.getPriority());
        System.out.println(" :: " + p2.getThreadName() + " priority of Thread : " + p2.getPriority());
        System.out.println(" :: " + p3.getThreadName() + " priority of Thread : " + p3.getPriority());
    }
}
