package model;

public class Novel extends Ebook{
    private String genre;
    private double price;

    public Novel(){

    }

    public Novel(String bookCode, String title, Novelis author, Publisher publisher, String genre){
        super(bookCode, title, author, publisher);
        this.genre = genre;
        calculatePrice();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Novelis getAuthor(){
        return (Novelis) super.getAuthor();
    }

    @Override
    public void calculatePrice() {
        if (getAuthor().getRating().equalsIgnoreCase("New Commer")){
            setPrice(1.25 * getPublisher().getProductionCost());
        }
        else if (getAuthor().getRating().equalsIgnoreCase("Good")){
            setPrice(1.35 * getPublisher().getProductionCost());
        }
        else if (getAuthor().getRating().equalsIgnoreCase("Best Seller")){
            setPrice(1.5 * getPublisher().getProductionCost());
        }
    }

    @Override
    public String toString() {
        return "Novel [bookCode=" + getBookCode() + ", title="
                + getTitle() + ", author=" + getAuthor() + ", publisher=" + getPublisher() + ", price=" + price + ", genre=" + genre
                + "]";
    }

    
}
