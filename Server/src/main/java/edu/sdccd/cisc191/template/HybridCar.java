package edu.sdccd.cisc191.template;
/**
 * A class that represents a hybrid car with a manufacturer name, miles on the hybrid car, price, number of seats, an array of optional features and the number of doors on the hybrid car.
 * This class is a subclass of the car class, which is a subclass of the vehicle class, and it implements the combustible and chargeable interfaces.
 * It provides constructors to create a hybrid car object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class HybridCar extends Car implements Combustible, Chargeable {
    private int batteryCharge;
    private int fuelLevel = 0;

    /**
     * Creates a hybrid car with the given attributes.
     * @param make the name of the manufacturer of the hybrid car
     * @param miles the number of miles on the hybrid car
     * @param price the price of the hybrid car in dollars
     * @param numSeats the number of seats in the hybrid car
     * @param options an array of optional features for the hybrid car
     * @param numDoors the number of doors in the hybrid car
     */
    public HybridCar(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }


    /** Returns the charge of the battery as a percentage.
     * @return the charge of the battery as a percentage
     */
    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /** Sets the charge of the battery to the given value.
     * @param batteryCharge the charge of the battery as a percentage
     * @throws IllegalArgumentException if the given value is less than 0 or greater than 100
     */
    public void setBatteryCharge(int batteryCharge) {
        if (batteryCharge < 0 || batteryCharge > 100) {
            throw new IllegalArgumentException("Battery charge must be between 0 and 100");
        }
        this.batteryCharge = batteryCharge;
    }

    /**
     * Charges the battery of the hybrid car by setting the battery charge to 100.
     */
    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

    /** Returns the level of fuel in the hybrid car as a percentage.
     * @return the level of fuel in the hybrid car as a percentage
     */
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Fills the tank of the hybrid car by setting the fuel level to 100.
     */
    @Override
    public void tankUp() {
        fuelLevel = 100;
    }
}
