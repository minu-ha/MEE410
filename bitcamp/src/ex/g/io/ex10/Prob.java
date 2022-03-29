package ex.g.io.ex10;

import java.util.Scanner;

public class Prob {

    public static char checkGrade(double avg) {

        return switch ((int) avg / 10) {
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public static void main(String[] args) {

        String stdNum;
        int kor;
        int math;
        int eng;
        int java;
        int sum;
        double avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("학번을 입력하세요");
        stdNum = keyboard.nextLine();

        System.out.println("국어성적을 입력하세요");
        kor = keyboard.nextInt();

        System.out.println("수학성적을 입력하세요");
        math = keyboard.nextInt();

        System.out.println("영어성적을 입력하세요");
        eng = keyboard.nextInt();

        System.out.println("자바성적을 입력하세요");
        java = keyboard.nextInt();

        sum = kor + eng + math + java;
        avg = sum / 4.0;


        System.out.println();
        System.out.println(" stdNum : " + stdNum);
        System.out.println();

        System.out.println(" kor : " + kor);
        System.out.println(" math : " + math);
        System.out.println(" eng : " + eng);
        System.out.println(" java : " + java);
        System.out.println();

        System.out.println(" sum : " + sum);
        System.out.println(" avg : " + avg);
        System.out.println(" grade : " + checkGrade(avg));
    }
}
