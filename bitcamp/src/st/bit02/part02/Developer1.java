package st.bit02.part02;

public class Developer1{

    // attribute -> field 표현
    String name = "홍길동";
    String job = "개발자";

    int avgIncome = 100;
    int projectCareer;

    // behavior -> method 표현
    // 프로젝트 참여
    public void participateProject(){
        System.out.println("프로그램개발로 수입증가 경력쌓임");
        avgIncome++;
        projectCareer++;
    }

    // 프로젝트의 이름을 출력
    public void participateProject(String project){
        System.out.println(project +"프로젝트 참여로 수입증가 경력쌓임");
        avgIncome++;
        projectCareer++;
    }

    // 강의 수입증가
    public void instruct(){
        System.out.println("강의를 통한 수입증가");
        avgIncome++;
    }

    // 강의 수에 따른 수입증가
    public void instruct(int lectureCount){
        System.out.println(lectureCount+"개 강의를 통한 수입증가");
        avgIncome += lectureCount;
    }
}