package st.bit03.part02;

public class Manager extends Employee{

    //field
    int salary;

    //constructor
    public Manager(){
        System.out.println("Manager의 default constructor");
    }
    public Manager(String str){
        super(str);
        System.out.println("Manager의 name을 받는 constructor");
    }
    public Manager(String str1, String str2){
        this(str1);
        part = str2;
        System.out.println("Manager의 name,part를 받는 constructor");
    }
    public Manager(String str1, String str2, int i){
        super ( str1, str2, i);
        age = i;
        System.out.println("Manager의 name,part,age를 받는 constructor");
    }
    public Manager(String str1, String str2, int i, int j){
        this( str1, str2, i);
        salary = j;
        System.out.println("Manager의 name,part,age,salary를 받는 constructor");
    }

    //method
    public void callSalary(){
        System.out.println("Manager의 기본급은 : " + salary());
    }

    //main method
    public static void main(String args[]){
        Manager m1 = new Manager("홍길동");
        Manager m2 = new Manager("홍길동","EJB");
        Manager m3 = new Manager("홍길동","EJB",25);
        Manager m4 = new Manager("홍길동","EJB",25,300);

        System.out.println("overriding된 salary호출 :" + m4.salary());
        m4.callSalary();
    }
}