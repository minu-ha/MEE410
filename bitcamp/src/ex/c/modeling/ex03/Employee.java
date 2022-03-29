package ex.c.modeling.ex03;

class Employee extends Human{

    //field
    private String dept;

    //constructor
    public Employee(){
    }
    public Employee(String subject) {
        this.dept = subject;
    }
    public Employee(String name, int age, String subject) {
        super(name, age);
        this.dept = subject;
    }

    //getter setter method
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    //method
    public void print(){
        System.out.println("이름:" + getName() + "나이:" +getAge() + "학번:" + getDept());
    }
}