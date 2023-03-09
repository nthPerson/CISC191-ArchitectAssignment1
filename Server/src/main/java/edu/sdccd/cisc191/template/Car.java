package edu.sdccd.cisc191.template;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }

    public Car() {
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numDoors) {
        numberOfDoors = numDoors;
    }
}