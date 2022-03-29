package ex.d.inheritance.ex02;

import java.lang.Math;

class Circle extends Shape{

    //field
    private double radius;

    //constructor
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    //getter setter method
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    //method
    @Override
    public void calculationArea(){
        setArea(Math.PI * radius * radius);
    }
}