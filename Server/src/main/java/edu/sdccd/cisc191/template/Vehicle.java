package edu.sdccd.cisc191.template;

public class Vehicle {
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;
    public Vehicle() {}

    public Vehicle(String make, int miles, int price, int numSeats, Option[] options) {
        manufacturerName = make;
        milesOnVehicle = miles;
        this.price = price;
        numberOfSeats = numSeats;
        this.options = options;

    }
    public void setManufacturerName(String make) {
        manufacturerName = make;
    }

    public void setMilesOnVehicle(int miles) {
        milesOnVehicle = miles;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void setNumberOfSeats(int numSeats) {
        numberOfSeats = numSeats;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }
}

