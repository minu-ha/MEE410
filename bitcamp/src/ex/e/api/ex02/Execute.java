package ex.e.api.ex02;

public class Execute {
    public static void main(String[] args){
        Adder adder = new Adder();

        String expr = "3+5+9+1";
        System.out.println(expr + "=" + adder.execute(expr));

        expr = "11+45+77+3";
        System.out.println(expr + "=" + adder.execute(expr));

        expr = "33+51+12+11";
        System.out.println(expr + "=" + adder.execute(expr));
    }
}
