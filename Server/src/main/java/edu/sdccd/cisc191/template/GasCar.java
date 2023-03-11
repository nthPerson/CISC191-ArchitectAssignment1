package edu.sdccd.cisc191.template;
/**
 * A class that represents a gas car with a manufacturer name, miles on the gas car, price, number of seats, an array of optional features and the number of doors on the gas car.
 * This class is a subclass of the car class, which is a subclass of the vehicle class.
 * It provides constructors to create a gas car object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class GasCar extends Car implements Combustible {
    private int fuelLevel = 0;

    /**
     * Creates a new gas car with the given attributes.
     * @param make the name of the manufacturer of the gas car
     * @param miles the number of miles on the gas car
     * @param price the price of the gas car in dollars
     * @param numSeats the number of seats in the gas car
     * @param options an array of optional features for the gas car
     * @param numDoors the number of doors in the gas car
     */
    public GasCar(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }

    /** Returns the level of fuel in the gas car as a percentage.
     * @return the level of fuel in the gas car as a percentage
     */
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Fills the tank of the gas car by setting the fuel level to 100.
     */
    @Override
    public void tankUp() {
        fuelLevel = 100;
    }
}
