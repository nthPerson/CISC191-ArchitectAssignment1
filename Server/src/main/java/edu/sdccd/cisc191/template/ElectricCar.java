package edu.sdccd.cisc191.template;
/**
 * A class that represents an electric car with a manufacturer name, miles on the electric car, price, number of seats, an array of optional features and the number of doors on the electric car.
 * This class is a subclass of the car class, which is a subclass of the vehicle class, and it implements the chargeable interface.
 * It provides constructors to create an electric car object with default or specified values, and getter and setter methods to access and modify its fields.
 */
public class ElectricCar extends Car implements Chargeable {
    private int batteryCharge;

    /**
     * Creates an electric car with the given attributes.
     * @param make the name of the manufacturer of the electric car
     * @param miles the number of miles on the electric car
     * @param price the price of the electric car in dollars
     * @param numSeats the number of seats in the electric car
     * @param options an array of optional features for the electric car
     * @param numDoors the number of doors in the electric car
     */
    public ElectricCar(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }

    /**
     * Sets the charge of the battery to the given value.
     * @param charge the charge of the battery as a percentage
     * @throws IllegalArgumentException if the given value is not between 0 and 100
     */
    public void setBatteryCharge(int charge) {
        if (charge < 0 || charge > 100) {
            throw new IllegalArgumentException("Battery charge must be between 0 and 100");
        }
        batteryCharge = charge;
    }

    /** Returns the charge of the battery as a percentage.
     * @return the charge of the battery as a percentage
     */
    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /**
     * Charges the battery of the electric car by setting the battery charge to 100.
     */
    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }
}
