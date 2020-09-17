package book;

public class InternationalBook extends Book {
    private String country;
    private String language;
    
    public InternationalBook(){
        super();
    }
    public InternationalBook(String bookname, double bookprice, String country, String language) {
            super(bookname, bookprice);
            this.country= country;
            this.language= language;
        }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString()+" Country: "+country+" Language: "+language;
    }
            
       
}
