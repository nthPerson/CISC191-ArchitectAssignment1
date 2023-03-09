package edu.sdccd.cisc191.template;

public class SportUtilityVehicle extends Vehicle {
    private int maxTowingWeight;
    public SportUtilityVehicle(String make, int miles, int price, int numSeats, Option[] options, int maxWeight) {
        setManufacturerName(make);
        setMilesOnVehicle(miles);
        setPrice(price);
        setNumberOfSeats(numSeats);
        setOptions(options);
        setMaxTowingWeight(maxWeight);
    }

    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }

    public void setMaxTowingWeight(int maxWeight) {
        maxTowingWeight = maxWeight;
    }

}

