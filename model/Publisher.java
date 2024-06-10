package model;

public class Publisher {
    private String name;
    private String country;
    private double productionCost;

    public Publisher(){

    }

    public Publisher(String name, String country, double productionCost){
        this.name = name;
        this.country = country;
        this.productionCost = productionCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    @Override
    public String toString() {
        return "Publisher [name=" + name + ", country=" + country + ", productionCost=" + productionCost + "]";
    }

    
}
