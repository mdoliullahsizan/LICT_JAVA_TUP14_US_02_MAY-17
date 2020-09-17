package book;

public class Book {
    
    private String bookName;
    private double bookprice;
    
    public Book(){
    
}
   public Book(String bookName, double bookprice) {
       this.bookName= bookName;
       this.bookprice= bookprice;
   }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public String toString() {
        return "Book Name: "+bookName+"Book Price: "+bookprice;
    }
    
   
}
