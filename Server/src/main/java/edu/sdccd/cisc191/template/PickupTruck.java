package edu.sdccd.cisc191.template;
/**
 * A class that represents pickup truck with a manufacturer name, miles on the pickup truck, price, number of seats, an array of optional features and the number of doors on the pickup truck.
 * This class is a subclass of the vehicle class.
 * It provides constructors to create a pickup truck object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class PickupTruck extends Vehicle {
    private int cargoCapacity;

    /**
     * Creates a new pickup truck with the given attributes.
     * @param make the name of the manufacturer of the pickup truck
     * @param miles the number of miles on the pickup truck
     * @param price the price of the pickup truck in dollars
     * @param numSeats the number of seats in the pickup truck
     * @param options an array of optional features for the pickup truck
     * @param cargoCapacity the cargo capacity of the pickup truck in pounds
     */
    public PickupTruck(String make, int miles, int price, int numSeats, Option[] options, int cargoCapacity) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setCargoCapacity(cargoCapacity);

    }

    /** Returns the cargo capacity of the pickup truck in pounds.
     * @return the cargo capacity of the pickup truck in pounds
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /** Sets the cargo capacity of the pickup truck to the given value.
     * @param cargoCapacity the new cargo capacity of the pickup truck
     */
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
