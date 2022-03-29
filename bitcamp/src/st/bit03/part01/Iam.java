package st.bit03.part01;

public class Iam extends Human {

    //field
    String job;

    //constructor
    public Iam(){
        System.out.println("Iam class default Constructor");
    }

    //method
    //setter method
    public void setJob(String str){
        job = str;
    }

    //getter method
    public String getJob(){
        return job;
    }

    //main method
    public static void main(String args[]){
        Iam iam = new Iam();

        iam.setName("홍길동");
        iam.setAge(100);
        iam.setJob("개발자");

        System.out.println("이름 :" +iam.getName());
        System.out.println("나이 :" +iam.getAge());
        System.out.println("직업 :" +iam.getJob());

    }//eom
}//eoc