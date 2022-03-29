package st.bit03.part01;

public class Son extends Iam {

    //field
    String school;

    //constructor
    public Son(){
        System.out.println("Son class default Constructor");
    }

    //method


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void main(String args[]){
        Son son = new Son();

        son.setName("홍길동아들");
        son.setAge(50);
        son.setJob("개발자준비중");
        son.setSchool("아이티교육센터");

        System.out.println("이름 : " + son.getName());
        System.out.println("나이 : " + son.getAge());
        System.out.println("직업 : " + son.getJob());
        System.out.println("직업 : " + son.getSchool());
    }
}