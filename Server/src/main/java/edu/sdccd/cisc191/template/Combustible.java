package edu.sdccd.cisc191.template;

/**
 * This interface defines the behavior of a combustible object.
 * A combustible object can fill its fuel tank up and return the fuel level.
 */
public interface Combustible {

    /** Returns the fuel level.
     * @return the fuel level
     */
    int getFuelLevel();

    /**
     * Fills the fuel tank.
     */
    void tankUp();
}
