package ex.a.base;

public class Ex09 {
    public void star(int k) {
        for(int i=1; i<k; i++){
            for(int j=1; j<=k-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int input = Integer.parseInt(args[0]);

        Ex09 st = new Ex09();
        st.star(input);
    }
}