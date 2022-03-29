package st.bit02.part02;

public class Developer1Test{

    public static void main(String[] args){

        // Developer1.class 를 Instance 생성
        Developer1 developer = new Developer1();

        // developer 식별성을 갖는 Instance 연산자를 통해 사용
        System.out.println("이름은:"+developer.name);
        System.out.println("직업은:"+developer.job);
        System.out.println("평균수입은:"+developer.avgIncome);
        System.out.println("PJT경력은:"+developer.projectCareer);

        System.out.println();

        // 프로젝트 참여
        developer.participateProject();
        System.out.println("평균수입은 :"+developer.avgIncome);
        System.out.println("프로젝트 참여경력은 :"+developer.projectCareer);

        System.out.println();

        // 1개 과목을 강의
        developer.instruct();
        System.out.println("평균수입은 :"+developer.avgIncome);

        System.out.println();

        // 홍길동이 한미은행 프로젝트에 참여
        // String projectName = "한미은행";
        // developer.participateProject(projectName);
        developer.participateProject("한미은행");
        System.out.println("평균수입은 :"+developer.avgIncome);
        System.out.println("프로젝트 참여경력은 :"+developer.projectCareer);

        System.out.println();

        // 홍길동이 2개 과목을 강의
        // int lectureCount = 2;
        // developer.instruct(lectureCount);
        developer.instruct(2);
        System.out.println("평균수입은 :"+developer.avgIncome);

        System.out.println();
    }
}