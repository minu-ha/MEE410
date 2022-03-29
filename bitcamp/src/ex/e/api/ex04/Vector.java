package ex.e.api.ex04;

public class Vector<U> {

    public java.util.Vector<String> moveToVector(String[] datas) {

        java.util.Vector<String> vector = new java.util.Vector<>();
        for (int loop = datas.length - 1; loop >= 0; loop--) {
            vector.add(datas[loop]);
        }
        return vector;
    }

    public void main(String[] args) {
        Vector<U> ac = new Vector<>();
        String[] datas = {"1", "2", "3", "4", "5"};
        System.out.println(ac.moveToVector(datas));
    }
}
