package st.bit03.part01;

public class Human{

    //field
    String name;
    int age;

    //constructor
    public Human(){
        System.out.println("Human class default Constructor");
    }
    public Human(String str){
        System.out.println("Human class의 name을 받는 Constructor");
        name = str;
    }

    //method
    //setter method
    public void setName(String str){
        name = str;
    }
    public void setAge(int b){
        age = b;
    }

    //getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}//eoc