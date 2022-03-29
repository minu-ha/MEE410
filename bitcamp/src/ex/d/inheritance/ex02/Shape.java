package ex.d.inheritance.ex02;

abstract class Shape{

    //field
    private String name;
    private double area;

    //constructor
    public Shape(){}
    public Shape(String name){
        this.name = name;
    }

    //getter setter method
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }

    //abstract method
    public abstract void calculationArea();

    //method
    public void print(){
        System.out.println( name + " 의 면적은" + area);
    }
}