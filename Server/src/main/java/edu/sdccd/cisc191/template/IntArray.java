package edu.sdccd.cisc191.template;

import java.util.Arrays;

/**
 * A class that represents a one-dimensional integer array.
 * It provides constructors to create a one-dimensional integer array object with default or specified values, getter and setter methods for elements of the array, and methods for finding min/max values or specific elements of the array.
 */
public class IntArray {

    int[] array;

    /**
     * Constructs an integer array from the given 1D array of integers.
     * @param nums the 1D array of integers used to initialize the array
     */
    //Take in int[]
    IntArray(int[] nums) {
        array = nums;
    }

    /**
     * Returns the element of the array at the given index and prints the result to the console.
     * @param index the index of the desired element
     * @return the element of the array at the given index
     */
    //Print
    int getAtIndex(int index) {

        System.out.println(array[index]);
        return array[index];
    }

    /**
     * Sets the value of the element at the given index to the given value and prints the updated contents of the array to the console.
     * @param index index of the desired element
     * @param newValue the new value of the element at the given index
     */
    void setAtIndex(int index, int newValue) {

        array[index] = newValue;
        System.out.println(Arrays.toString(array));
    }

    /**
     * Finds the index of the given number in the array.
     * @param num The number to search for
     * @return the index of the number in the array, or -1 if the number is not found or the array is null.
     */
    public int findIndex(int num) {

        // if array is Null
        if (array == null) {
            System.out.println("array is null");
            return -1;
        }

        // find length of array
        int len = array.length;
        int i = 0;

        // traverse  the array
        while (i < len) {

            // if the i-th element is num
            // then return the index
            if (array[i] == num) {

                System.out.println(i);
                return i;
            } else {

                i = i + 1;
            }
        }

        System.out.println("num not found");
        return -1;
    }

    /**
     * Prints all elements of the array on individual lines.
     */
    void printAll() {

        for (int element : array) {

            System.out.print(element + " ");
        }
        System.out.println("");
    }

    /**
     * Deletes the element at the given index in the array.
     * @param index the index of the element to delete
     * @throws ArrayIndexOutOfBoundsException if the index is out of bounds
     */
    void deleteAtIndex(int index) {

        int[] array_new = new int[array.length - 1];
       //loop through array
        for (int i = 0, k = 0; i < array.length; i++) {

            if (i != index) {
               // copy array if not the desired index
                array_new[k] = array[i];
                k++;
            }
        }

        array = array_new;
        System.out.println(Arrays.toString(array));
    }

    /**
     * Increases the length of the array by 1.
     */
    public void expand() {

        int[] newArray = new int[array.length + 1];
        // copy into new array from start of array
        System.arraycopy(array, 0, newArray, 0, array.length);

        array = newArray;

        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Shrinks the array to the given size and prints a string representation of the array to the console.
     * @param size the new size of the array.
     */
    void shrink(int size) {

        int[] newArray = new int[size];
        // copy into new array from start of array
        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;

        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Sorts the array in ascending numerical order and returns the last element, which is the maximum value in the array.
     * @return the maximum element in the array
     */
//sort array and get last index
    int max() {

        Arrays.sort(array);

        System.out.println(array[array.length - 1]);

        return array[array.length - 1];

    }

    /**
     * Sorts the array in ascending numerical order and returns the first element, which is the minimum value in the array.
     * @return the minimum value in the array
     */
//sort array and get first index
    int min() {

        Arrays.sort(array);

        System.out.println(array[0]);

        return array[0];
    }
}
