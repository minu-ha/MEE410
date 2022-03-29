package ex.g.io.ex06;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Prob {

    public static void main(String[] args) throws Exception{

        Vector scores = new Prob().getScore("scr/data.txt");
        for (Object o : scores) {
            Score score = (Score) o;
            System.out.println(score.getName() + score.getKor() + score.getEng() + score.getMath() + score.getSum());
        }
    }

    public Stack getScore(String fileName) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String readLine = bufferedReader.readLine();
        String[] strings = readLine.split("/");

        List stack = new Stack();
        while (readLine != null) {

            int kor = Integer.parseInt(strings[1]);
            int eng = Integer.parseInt(strings[2]);
            int math = Integer.parseInt(strings[3]);
            int sum = kor+eng+math;

            stack.add(new Score(strings[0], kor, eng, math, sum));
            readLine = bufferedReader.readLine();
        }

        return (Stack) stack;
    }
}

class Score{

    //field
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;

    //constructor

    public Score() {}

    public Score(String name, int kor, int eng, int math, int sum) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = sum;
    }


    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}


