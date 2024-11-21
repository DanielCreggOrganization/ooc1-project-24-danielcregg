package ie.atu.watchmanager;

public class Watch {

    // Instance Variables
    private int serialNumber; // Unique ID
    private String brand;
    private float price;
    private boolean isSold;

    // Constructor
    public Watch(int serialNumber, String brand, float price, boolean isSold){
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.price = price;
        this.isSold = isSold;
    }

    // Getters and Setters
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }

    

}
