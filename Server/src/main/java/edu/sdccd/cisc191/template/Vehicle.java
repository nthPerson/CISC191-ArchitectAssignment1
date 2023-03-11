package edu.sdccd.cisc191.template;
/**
 * A class that represents a vehicle with a manufacturer name, miles on the vehicle, price, number of seats, and an array of optional features.
 * This class is the parent class of different types of vehicles, such as cars, pickup trucks and sport utility vehicles.
 * It provides constructors to create a vehicle object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class Vehicle {
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    /**
     * Creates a vehicle with no attributes.
     */
    public Vehicle() {}

    /**
     * Creates a new vehicle with the given attributes.
     * @param make the name of the manufacturer of the vehicle
     * @param miles the number of miles on the vehicle
     * @param price the price of the vehicle in dollars
     * @param numSeats the number of seats in the vehicle
     * @param options an array of optional features for the vehicle
     */
    public Vehicle(String make, int miles, int price, int numSeats, Option[] options) {
        manufacturerName = make;
        milesOnVehicle = miles;
        this.price = price;
        numberOfSeats = numSeats;
        this.options = options;

    }

    /**
     * Sets the name of the manufacturer of the vehicle to the given value.
     * @param make the new name of the manufacturer of the vehicle
     */
    public void setManufacturerName(String make) {
        manufacturerName = make;
    }

    /**
     * Sets the number of miles on the vehicle to the given value.
     * @param miles the new number of miles on the vehicle
     * @throws IllegalArgumentException if the new number of miles is negative
     */
    public void setMilesOnVehicle(int miles) {
        if (miles < 0) {
            throw new IllegalArgumentException("Miles on vehicle cannot be negative");
        }
        milesOnVehicle = miles;
    }

    /**
     * Sets the price of the Vehicle to the given value.
     * @param newPrice the new price of the product in cents
     * @throws IllegalArgumentException if the new price is negative
     */
    public void setPrice(int newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        price = newPrice;
    }

    /**
     * Sets the number of seats in the vehicle to the given value.
     * @param numSeats the new number of seats in the vehicle
     * @throws IllegalArgumentException if the new number of seats is zero or negative
     */
    public void setNumberOfSeats(int numSeats) {
        if (numSeats <= 0) {
            throw new IllegalArgumentException("Number of seats must be positive");
        }
        numberOfSeats = numSeats;
    }

    /**
     * Sets the optional features array to the given value.
     * @param options an array of optional features for the vehicle
     */
    public void setOptions(Option[] options) {
        this.options = options;
    }

    /**
     * Returns the name of the manufacturer of the vehicle.
     * @return the name of the manufacturer of the vehicle
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Returns the miles on the vehicle.
     * @return the miles on the vehicle
     */
    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    /**
     * Returns the price of the vehicle in dollars.
     * @return the price of the vehicle in dollars
     */
    public int getPrice() {
        return price;
    }

    /**
     * Retruns the number of seats in the vehicle.
     * @return the number of seats in the vehicle
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Returns the array of optional features for the vehicle.
     * @return the array of optional features for the vehicle
     */
    public Option[] getOptions() {
        return options;
    }
}

