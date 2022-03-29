package st.bit04.part04;

public abstract class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
