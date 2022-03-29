package ex.c.modeling.ex01;

import java.util.Scanner;

public class TestRectangle{

    //main method
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        Ractangle rec1 = new Ractangle();
        System.out.println("첫번째 직사각형의 색깔");
        rec1.setColor(keyboard.next());

        System.out.println("첫번째 직사각형의 가로");
        rec1.setWidth(keyboard.nextInt());

        System.out.println("첫번째 직사각형의 세로");
        rec1.setLength(keyboard.nextInt());

        Ractangle rec2 = new Ractangle();
        System.out.println("첫번째 직사각형의 색깔");
        rec2.setColor(keyboard.next());

        System.out.println("첫번째 직사각형의 가로");
        rec2.setWidth(keyboard.nextInt());

        System.out.println("첫번째 직사각형의 세로");
        rec2.setLength(keyboard.nextInt());

        System.out.println(rec1.getColor() + "직사각형의 넓이는" + rec1.area() +
                "이고 둘레는" + rec1.perimeter() + "입니다.");

        System.out.println(rec2.getColor() + "직사각형의 넓이는" + rec2.area() +
                "이고 둘레는" + rec2.perimeter() + "입니다.");

        if(rec1.area() > rec2.area()){
            System.out.println("넓이는" + rec1.getColor() + "직사각형이 더 큽니다.");
        }else if(rec1.area() < rec2.area()){
            System.out.println("넓이는" + rec2.getColor() + "직사각형이 더 큽니다.");
        }else{
            System.out.println("넓이는 같습니다");
        }

        if(rec1.perimeter() > rec2.perimeter()){
            System.out.println("넓이는" + rec1.getColor() + "직사각형이 더 큽니다.");
        }else if(rec1.perimeter() < rec2.perimeter()){
            System.out.println("넓이는" + rec2.getColor() + "직사각형이 더 큽니다.");
        }else{
            System.out.println("넓이는 같습니다");
        }
    }
}