package ex.e.api.ex10;

import java.util.Vector;

public class DataChange {

    public Vector<String> dataChange(String[] strData) {

        Vector<String> vector = new Vector<>();

        for (int loop = strData.length - 1; loop >= 0; loop--) {
            vector.add(strData[loop]);
        }

        String[] reverseVector = new String[vector.size()];
        for (int i = 0; i < reverseVector.length; i++) {
            reverseVector[i] = vector.elementAt(i);
        }

        String result = "";
        Vector<String> vector2 = new Vector<>();
        for (int i = reverseVector.length-1; i >= 0; i--) {
            for (int j = reverseVector[i].length() - 1; j >= 0; j--) {
                result += reverseVector[i].charAt(j);
            }
            vector2.add(0,result);
            result = "";
        }




        return vector2;
    }

    public static void main(String[] args) {

        DataChange st = new DataChange();
        String[] strData = {"Java programming", "JDBC", "Oracle10g", "JSP/Servlet"};

        Vector<String> v = st.dataChange(strData);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
    }
}
