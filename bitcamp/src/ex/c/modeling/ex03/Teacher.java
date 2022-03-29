package ex.c.modeling.ex03;

public class Teacher extends Human{
    //field
    private String subject;

    //constructor
    public Teacher(){
    }
    public Teacher(String subject) {
        this.subject = subject;
    }
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //getter setter method
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //method
    public void print(){
        System.out.println("이름:" + getName() + "나이:" +getAge() + "학번:" + getSubject());
    }
}

