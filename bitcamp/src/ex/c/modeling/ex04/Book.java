package ex.c.modeling.ex04;

class Book {

    //field
    private String title;
    private int price;

    //constructor
    public Book(){
    }
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    //getter setter method
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}//class end