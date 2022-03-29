package st.bit02.part05;

public class User03{

    //field
    String name;
    int javaLevel;

    //default constructor
    public User03(){
        System.out.println("나는 생성자");
        name = "홍길동";
        javaLevel = 0;
    }

    //인스턴스 생성시 name값을 설정하는 생성자
    public User03(String str){
        System.out.println("나는 String을 인자로 받아 name을 초기화하는 생성자");
        name = str;
    }
    public User03(int i){
        System.out.println("나는 int을 인자로 받아 javaLevel을 초기화하는 생성자");
        javaLevel = i;
    }
    public User03(String str, int i){
        System.out.println("나는 String,int을 인자로 받아 name,javaLevel을 초기화하는 생성자");
        javaLevel = i;
        name = str;
    }

    //method - getter method edfinition
    public String getName(){
        return name;
    }
    public int getJavaLevel(){
        return javaLevel;
    }

    //main method
    public static void main(String[] args){

        System.out.println();
        User03 user01 = new User03();
        System.out.println("name : "+ user01.getName());
        System.out.println("javaLevel : "+ user01.getJavaLevel());

        System.out.println();
        User03 user02 = new User03("홍길순");
        System.out.println("name : "+ user02.getName());
        System.out.println("javaLevel : "+ user02.getJavaLevel());

        System.out.println();
        User03 user03 = new User03(100);
        System.out.println("name : "+ user03.getName());
        System.out.println("javaLevel : "+ user03.getJavaLevel());

        System.out.println();
        User03 user04 = new User03("이순신",200);
        System.out.println("name : "+ user04.getName());
        System.out.println("javaLevel : "+ user04.getJavaLevel());
    }
}