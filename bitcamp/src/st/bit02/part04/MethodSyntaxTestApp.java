package st.bit02.part04;

public class MethodSyntaxTestApp{

    //field
    //Method
    //Main
    public static void main(String[] args){

        //MethodSyntax.class를 사용 (Instance 생성 = new 연산자사용)
        MethodSyntax methodSyntax = new MethodSyntax();

        //MethodSyntax 식별성을 갖는 Instance의 method를 연산자로 접근사용
        System.out.println("\n======================");
        methodSyntax.broswerOn();

        System.out.println("\n======================");
        boolean result = methodSyntax.documentWork();
        System.out.println("doc작업유무:"+result);

        System.out.println("\n======================");
        int value = methodSyntax.sum(1,1);
        System.out.println("계산결과값:"+value);
        //System.out.println("계산결과값:"+methodSyntax.sum(1,1));

        System.out.println("\n======================");
        String name = methodSyntax.getName();
        System.out.println("필드정보 이름:"+name);
        //System.out.println("필드정보 이름:"+methodSyntax.getName());

        System.out.println("\n======================");
        String add = methodSyntax.getAdd();
        System.out.println("필드정보 주소:"+add);
        //System.out.println("필드정보 주소:"+methodSyntax.getAdd());

        System.out.println("\n======================");
        String[] info = methodSyntax.getAllInformation();
        System.out.println("필드정보 모두출력");

        for(int i = 0; i < info.length; i++){
            System.out.println(((i + 1) + "번째 정보" + info[i]));
        }

    }
}
