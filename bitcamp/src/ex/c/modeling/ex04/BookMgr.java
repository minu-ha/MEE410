package ex.c.modeling.ex04;

import java.util.Arrays;

class BookMgr{

    //field
    Book[] booklist;

    //constructor
    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }
    public void printBooklist() {
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }
        System.out.println(Arrays.toString(booklist));
    }
    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < booklist.length; i++) {
            sum += booklist[i].getPrice();
        }
        System.out.println(sum);
    }

}
