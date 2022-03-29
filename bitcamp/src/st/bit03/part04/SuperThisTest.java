package st.bit03.part04;

class JuniorHighSchool{

    //field
    String name = "대한민국중학교";

    //constructor
    public JuniorHighSchool(){
        System.out.println("중학교 이름 : " + name);
    }
}

class HighSchool extends JuniorHighSchool{

    //field
    String name = "대한민국고등학교";

    //constructor
    public HighSchool(){
    }

    //constructor O/R
    public HighSchool(String str){
        name = str;
    }

    //method
    public void schoolName(){
        System.out.println("중학교 이름 : " + super.name);
        System.out.println("고등학교 이름 : " + this.name);
        System.out.println("고등학교 이름 : " + name);
    }
}


public class SuperThisTest{

    //main method
    public static void main(String[] args){

        HighSchool hs01 = new HighSchool();
        hs01.schoolName();

        System.out.println("\n");

        HighSchool hs02 = new HighSchool("서울고등학교");
        hs02.schoolName();
    }
}