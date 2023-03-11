package edu.sdccd.cisc191.template;
/**
 * A class that represents a sport utility vehicle with a manufacturer name, miles on the sport utility vehicle, price, number of seats, an array of optional features and the number of doors on the sport utility vehicle.
 * This class is a subclass of the vehicle class.
 * It provides constructors to create a sport utility vehicle object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class SportUtilityVehicle extends Vehicle {
    private int maxTowingWeight;

    /**
     * Creates a new sport utility vehicle with the given attributes.
     * @param make the name of the manufacturer of the sport utility vehicle
     * @param miles the number of miles on the sport utility vehicle
     * @param price the price of the sport utility vehicle in dollars
     * @param numSeats the number of seats in the sport utility vehicle
     * @param options an array of optional features for the sport utility vehicle
     * @param maxWeight maximum weight that the sport utility vehicle can tow in pounds
     */
    public SportUtilityVehicle(String make, int miles, int price, int numSeats, Option[] options, int maxWeight) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setMaxTowingWeight(maxWeight);
    }

    /** Return maximum weight that the sport utility vehicle can tow in pounds.
     * @return maximum weight that the sport utility vehicle can tow in pounds
     */
    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }

    /**
     * Sets the maximum weight that the sport utility vehicle can tow in pounds to the given value.
     * @param maxWeight new maximum weight that the sport utility vehicle can tow in pounds
     * @throws IllegalArgumentException if the given value is negative
     */
    public void setMaxTowingWeight(int maxWeight) {
        if (maxWeight < 0) {
            throw new IllegalArgumentException("Maximum towing weight cannot be negative");
        }
        maxTowingWeight = maxWeight;
    }

}

