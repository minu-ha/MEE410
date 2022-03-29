package ex.c.modeling.ex04;

public class BookToBooklistMain {
    public static void main(String[] args) {

        Book[] booklist = new Book[5];

        Book book1 = new Book("java program", 25000);
        Book book2 = new Book("jsp program", 15000);
        Book book3 = new Book("sql program", 30000);
        Book book4 = new Book("jdbc program", 28000);
        Book book5 = new Book();

        book5.setTitle("ejb program");
        book5.setPrice(34000);

        booklist[0] = book1;
        booklist[1] = book2;
        booklist[2] = book3;
        booklist[3] = book4;
        booklist[4] = book5;

        BookMgr mgr = new BookMgr(booklist);

        System.out.println("booklist");
        mgr.printBooklist();

        System.out.println("sumprice of book");
        mgr.printTotalPrice();

    }
}