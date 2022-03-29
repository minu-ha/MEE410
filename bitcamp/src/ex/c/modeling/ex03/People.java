package ex.c.modeling.ex03;

public class People {
    public static void main(String[] args) {

        Student s = new Student("홍길동", 20, 20021);
        Teacher t = new Teacher("이순신", 30, "java");
        Employee e = new Employee("유관순", 40, "교무과");

        s.print();
        t.print();
        e.print();
    }
}