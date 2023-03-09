package edu.sdccd.cisc191.template;

public class ElectricCar extends Car implements Chargeable {
    private int batteryCharge;
    public ElectricCar(String make, int miles, int price, int numSeats, Option[] options, int numDoors) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setNumberOfDoors(numDoors);
    }

    public void setBatteryCharge(int charge) {
        batteryCharge = charge;
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }
}
