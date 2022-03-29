package ex.f.exception.ex03;

import java.util.Vector;

public class Prob {
    public static void main(String[] args) {

        Vector<Object> bookList = new Vector<>();

        try {
            bookList.add(makeBook("java programming 기초:컴퓨터:35000"));
            bookList.add(makeBook("초보자를 위한 sql:컴퓨터:28000"));
            bookList.add(makeBook("html5 api 소개:컴퓨터:58000"));
            bookList.add(makeBook("jdbc programming 기초:컴퓨터:45000"));
            bookList.add(makeBook("jsp programming 고급:컴퓨터:56000"));

            System.out.println(" << booklist >>");

            printBookList(bookList);
        } catch (DataFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Book makeBook(String bookData) {

        String[] strings = bookData.split(":");

        Book book = new Book();

        book.setTitle(strings[0]);
        book.setKind(strings[1]);
        book.setRentalPrice(Integer.parseInt(strings[2]));

        if (strings.length != 3) {
            throw new DataFormatException("not converted data format");
        }
        return book;
    }

    private static void printBookList(Vector<Object> bookList) {

        for ( Object book : bookList ) {
            System.out.println(book);

        }
    }
}
