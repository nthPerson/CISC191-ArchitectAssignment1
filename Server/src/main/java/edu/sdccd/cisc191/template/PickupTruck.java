package edu.sdccd.cisc191.template;

public class PickupTruck extends Vehicle {
    private int cargoCapacity;

    public PickupTruck(String make, int miles, int price, int numSeats, Option[] options, int cargoCapacity) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setCargoCapacity(cargoCapacity);

    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapcity) {
        cargoCapacity = cargoCapcity;
    }
}
