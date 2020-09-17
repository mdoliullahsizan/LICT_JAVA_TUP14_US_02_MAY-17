package book;

public class RegionalBook extends Book {
    private String authorName;
    public RegionalBook() {
        super();
    }
    public RegionalBook(String bookName, double bookPrice, String authorName){
        super (bookName, bookPrice);
        this.authorName= authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return super.toString()+" Author Name: "+authorName;
    }

    
}
