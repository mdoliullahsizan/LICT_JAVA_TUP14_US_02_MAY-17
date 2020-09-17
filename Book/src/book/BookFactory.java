package book;

public class BookFactory {
    public void checkBookType(Object book)
    {
        if (book instanceof Book)
        {
            Book b= (Book)book;
            System.out.println("This is Normal book");
            System.out.println(b.toString());
        }
        if (book instanceof InternationalBook)
        {
            InternationalBook i= (InternationalBook)book;
            System.out.println("This is InterNational Book");
            System.out.println(i);
        }
        if(book instanceof RegionalBook) 
        {
            RegionalBook r=(RegionalBook)book;
            System.out.println("This is Regionl Book");
            System.out.println(r);
        }
    }
}
