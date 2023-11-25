package web.model;

public class Car {

    private String model;

    private int dateOfManufacture;

    private int price;

    public Car(String model, int dateOfManufacture, int price) {
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(byte dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
