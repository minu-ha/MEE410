package st.bit02.part01;

public class Developer{

    //field = attribute
    String name = "홍길동";
    String job = "개발자";

    int avgIncome = 100;
    int projectCareer ; //변수를 선언만 한 경우 null 값이 출력된다.

    //method = behavior
    public void participateProject(){
        System.out.println("프로그램개발로 수입증가, 경력쌓임");
        avgIncome++;
        projectCareer++;
    }

    public void instruct(){
        System.out.println("강의를 통한 수입증가");
        avgIncome++;
    }
}