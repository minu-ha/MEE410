package st.bit02.part04;

public class MethodSyntax{

    //field
    String name = "홍길동";
    String add = "한양";

    //method
    public void broswerOn(){
        System.out.println("브라우저 실행");
    }

    //작업유무 리턴
    public boolean documentWork(){
        System.out.println("document 작업 후 완성 유무를 boolean return");
        return true;
    }

    //두개의 정수를 받아 합을 리턴
    public int sum(int i, int j){
        System.out.println(i + " 와 " + j + " 의 값을 받아 합 리턴");
        return ( i + j );
    }

    //이름을 리턴
    public String getName(){
        System.out.println("이름을 전달합니다.");
        return name;
    }

    //주소를 리턴
    public String getAdd(){
        System.out.println("주소를 전달합니다.");
        return add;
    }

    //이름 주소 두가지 정보를 배열리턴
    public String[] getAllInformation(){
        String[] str = { name , add };
        return str;
    }
}