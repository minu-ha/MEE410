package st.bit04.part03;

abstract class BusCharge{

    //field
    String section;

    //constructor
    public BusCharge(){
    }
    public BusCharge(String section){
        this.section = section;
    }

    //method
    public void information() {
        System.out.println("버스요금안내");
    }

    public abstract void charge();
}

//abstarct class 상속시 abstract method 필히 재정의할 것
class Student extends BusCharge{
    public Student(){
        super("학생");
    }
    public void charge(){
        System.out.println("300원");
    }
}

class Adult extends BusCharge{
    public Adult(){
        super("일반인");
    }
    public void charge(){
        System.out.println("500원");
    }
}

class Old extends BusCharge{
    public Old(){
        super("어르신");
    }
    public void charge(){
        System.out.println("공짜");
    }
}

public class Display{

    //main method
    public static void main(String args[]){

        Student b1 = new Student();
        Adult b2 = new Adult();
        Old b3 = new Old();

        b1.information();
        System.out.println(b1.section);
        b1.charge();

        b2.information();
        System.out.println(b2.section);
        b2.charge();


        b3.information();
        System.out.println(b3.section);
        b3.charge();
    }
}