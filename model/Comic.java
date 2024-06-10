package model;

public class Comic extends Ebook {
    private double price;
    private double tax;
    private boolean isVolumeSeries;

    public Comic(){

    }

    public Comic(String bookCode, String title, Mangaka author, Publisher publisher, boolean isVolumeSeries){
        super(bookCode, title, author, publisher);
        this.isVolumeSeries = isVolumeSeries;
        calculatePrice();
        calculateTax();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean isVolumeSeries() {
        return isVolumeSeries;
    }

    public void setVolumeSeries(boolean isVolumeSeries) {
        this.isVolumeSeries = isVolumeSeries;
    }

    public Mangaka getAuthor(){
        return (Mangaka) super.getAuthor();
    }

    @Override
    public void calculatePrice() {
        if (getAuthor().getRating().equalsIgnoreCase("New Commer")){
            if (isVolumeSeries){
                setPrice(1.35 * getPublisher().getProductionCost());
            }
            else {
                setPrice(1.25 * getPublisher().getProductionCost());
            }
        }
        else if (getAuthor().getRating().equalsIgnoreCase("Good")){
            if (isVolumeSeries){
                setPrice(1.45 * getPublisher().getProductionCost());
            }
            else {
                setPrice(1.3 * getPublisher().getProductionCost());
            }
        }
        else if (getAuthor().getRating().equalsIgnoreCase("Best Seller")){
            if (isVolumeSeries){
                setPrice(1.5 * getPublisher().getProductionCost());
            }
            else {
                setPrice(1.4 * getPublisher().getProductionCost());
            }
        }
    }

    public void calculateTax(){
        setTax(0.05 * price);
    }

    @Override
    public String toString() {
        return "Comic [bookCode=" + getBookCode() + ", title=" + getTitle() + ", author=" + getAuthor()
                + ", publisher=" + getPublisher() + ", price=" + price + ", tax=" + tax + ", isVolumeSeries=" + isVolumeSeries
                + "]";
    }

    
}
