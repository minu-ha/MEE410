package st.bit02.part03;

public class Developer2{

    //attribute -> field 표현
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

    // 상태값 리턴하는 getter method 정의
    public String getName(){
        System.out.println("getName() method");
        return name;
    }

    public String getJob(){
        System.out.println("getJob() method");
        return job;
    }

    public int getAvgIncome(){
        System.out.println("getAvgIncome() method");
        return avgIncome;
    }

    public int getProjectCareer(){
        System.out.println("getProjectCareer() method");
        return projectCareer;
    }

    public static void main(String[] args){

        // Developer1.class 를 Instance 생성
        Developer2 developer = new Developer2();

        // developer 식별성을 갖는 Instance 연산자를 통해 사용
        System.out.println("이름은:"+developer.name);
        System.out.println("직업은:"+developer.job);
        System.out.println("평균수입은:"+developer.avgIncome);
        System.out.println("PJT경력은:"+developer.projectCareer);

        System.out.println();

        // method 호출하여 상태값 받아 출력
        String name =  developer.getName();
        String job = developer.getJob();
        int avgIncome = developer.getAvgIncome();

        System.out.println("이름은"+name);
        System.out.println("직업은:"+job);
        System.out.println("평균수입은:"+avgIncome);
        System.out.println("평균수입은"+developer.getProjectCareer());

    }
}