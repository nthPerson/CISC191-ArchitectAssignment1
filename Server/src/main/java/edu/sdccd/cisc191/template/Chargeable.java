package edu.sdccd.cisc191.template;
/**
 * This interface defines the behavior of a fuel chargeable.
 * A chargeable object can charge up its battery and return the charge of the battery.
 */
public interface Chargeable {

    /** Returns the charge of the battery.
     * @return the charge of the battery
     */
    int getBatteryCharge();

    /**
     * Charges the battery.
     */
    void chargeUp();
}
