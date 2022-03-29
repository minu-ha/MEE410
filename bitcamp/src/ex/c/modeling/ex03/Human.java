package ex.c.modeling.ex03;

public class Human {

    //field
    private String name = null;
    private int age = 0;

    //constructor
    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter setter method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Human{

    //field
    private int id;

    //constructor
    public Student(){
    }
    public Student(int id) {
        this.id = id;
    }
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //method
    public void print(){
        System.out.println("이름:" + getName() + "나이:" +getAge() + "학번:" + getId());
    }
}