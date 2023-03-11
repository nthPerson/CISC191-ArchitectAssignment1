package edu.sdccd.cisc191.template;
/**
 * A class that represents car with a manufacturer name, miles on the vehicle, price, number of seats, an array of optional features and the number of doors on the vehicle.
 * This class is a subclass of the vehicle class, and it is the parent class of different types of cars, such as gas cars, hybrid cars and electric cars.
 * It provides constructors to create a car object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Creates a new car with the given attributes.
     * @param make the name of the manufacturer of the car
     * @param miles the number of miles on the car
     * @param price the price of the car in dollars
     * @param numSeats the number of seats in the car
     * @param options an array of optional features for the car
     * @param numDoors the number of doors on the car
     */
    public Car(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }

    /**
     * Creates a car with no attributes.
     */
    public Car() {
    }

    /**
     * Returns the number of doors on the car.
     * @return the number of doors on the car
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets the number of doors on the car to the given value.
     * @param numDoors the new number of doors on the car
     * @throws IllegalArgumentException if the given value is negative or greater than 6
     */
    public void setNumberOfDoors(int numDoors) {
        if (numDoors < 0 || numDoors > 6) {
            throw new IllegalArgumentException("Invalid number of doors");
        }
        numberOfDoors = numDoors;
    }
}