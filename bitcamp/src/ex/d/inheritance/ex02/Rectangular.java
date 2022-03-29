package ex.d.inheritance.ex02;

class Rectangular extends Shape{

    //field
    private double width;
    private double hight;

    //constructor
    public Rectangular(String name, double width, double hight){
        super(name);
        this.width = width;
        this.hight = hight;
    }

    //getter setter method
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHight(){
        return hight;
    }
    public void setHight(double hight){
        this.hight = hight;
    }

    //method
    public void calculationArea(){
        setArea( width * hight );
    }
}