package book;

public class Tester {
    public static void main(String[]args) {
        Book b= null;
        BookFactory factory= new BookFactory();
        b= new Book("Exploring C", 300);
        factory.checkBookType(b);
        b= new InternationalBook("Java In Nutchell", 100, "USA", "EN-US");
        factory.checkBookType(b);
        b = new RegionalBook("abcd",1000,"HOZo");
        factory.checkBookType(b);
    }
}
