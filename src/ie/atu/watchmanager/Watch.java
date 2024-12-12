package ie.atu.watchmanager;

public class Watch {

    // Instance Variables
    private int serialNumber; // Unique ID
    private String brand;
    private float priceEur;
    private boolean isSold;

    // Constructor
    public Watch(int serialNumber, String brand, float priceEur, boolean isSold) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.priceEur = priceEur;
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

    public float getPriceEur() {
        return priceEur;
    }

    public void setPriceEur(float priceEur) {
        this.priceEur = priceEur;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }

}
