package st.bit02.part03;

public class Developer2Test{

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