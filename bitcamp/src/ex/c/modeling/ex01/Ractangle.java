package ex.c.modeling.ex01;

public class Ractangle {

    //field
    String color;
    int width = 0;
    int length = 0;

    //setter method
    public void setColor(String str){
        color = str;
    }
    public void setWidth(int wid){
        width = wid;
    }
    public void setLength(int leng){
        length = leng;
    }

    //getter method
    public String getColor(){
        return color;
    }
    public int getWidth(){
        return width;
    }
    public int getlength(){
        return length;
    }

    //method
    public int area(){
        return width*length;
    }
    public int perimeter(){
        return (width+length)*2;
    }
}