package edu.sdccd.cisc191.template;

/**
 * A class represents an option on any kind of vehicle.
 * It provides constructors to create an option object with a default or specified value, and getter and setter methods to access and modify its field.
 */
public class Option {
    private String details;

    /**
     * Creates an option object without specified values
     */
    public Option() {}

    /**
     * Creates a new option object with the specified value
     * @param opt an option on any kind of vehicle
     */
    public Option(String opt) {
        details = opt;
    }

    /** Returns the details of the option.
     * @return the details of the option
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the details on the vehicle to the specified value.
     * @param detail the new details on the vehicle
     */
    public void setDetails(String detail) {
        if (detail.equals("")) {
            throw new IllegalArgumentException("Detail cannot be empty");
        }
        details = detail;
    }
}
