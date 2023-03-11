package edu.sdccd.cisc191.template;

import java.util.Arrays;

/**
 * A class that represents a multidimensional integer array.
 * It provides constructors to create a multidimensional integer array object with default or specified values, getter and setter methods for elements of the array, and methods for finding min/max values or specific elements of the array.
 */
public class MDIntArray {


    int[][] MDArray;

    /**
     * Constructs a multidimensional integer array from the given 2D array of integers.
     * @param nums the 2D array of integers used to initialize the multidimensional array
     */
    //set array
    MDIntArray(int[][] nums) {

        MDArray = nums;
    }

    /**
     * Returns the element of a multidimensional array at the given row and column and prints the result to the console.
     * @param row the row of the desired element
     * @param col the column of the desired element
     * @return the element of the multidimensional array at the given row and column
     */
    int getAtIndex(int row, int col) {

        System.out.println(MDArray[row][col]);
        return MDArray[row][col];
    }

    /**
     * Sets the value of the element at the given row and column to the given value and prints the updated contents of the multidimensional array to the console.
     * @param row the row of the desired element
     * @param col the column of the desired element
     * @param newValue the new value of the element at the given row and column
     */
    void setAtIndex(int row, int col, int newValue) {

        MDArray[row][col] = newValue;
        System.out.println(Arrays.deepToString(MDArray));
    }

    /**
     * Finds the index of the given number in the multidimensional array.
     * @param num the number to search for
     * @return a string representation of the index and column if the number is found, or "num not found" if the number is not located in the multidimensional array
     */
    public String findIndex(int num) {
        // Loop through all rows
        for (int i = 0; i < MDArray.length; i++) {

            for (int j = 0; j < MDArray[i].length; j++) {

                if (MDArray[i][j] == num) {

                    System.out.println("" + i + "," + j);
                    return "" + i + "," + j;
                }
            }
        }

        System.out.println("num not found");
        return "num not found";
    }

    /**
     * Prints all elements of the multidimensional array on a single line separated by spaces.
     */
    void printAll() {
        // Loop through all rows
        for (int i = 0; i < MDArray.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < MDArray[i].length; j++) {

                System.out.print(MDArray[i][j] + " ");
            }
        }
    }

    /**
     * Deletes the element at the given row and column by setting the value of the element to 0.
     * @param row the row of the desired element
     * @param col the column of the desired element
     */
    void deleteAtIndex(int row, int col) {
        // Loop through all rows
        for (int i = 0; i < MDArray.length; i++) {

            for (int j = 0; j < MDArray[i].length; j++) {

                if (MDArray[i][j] == MDArray[row][col]) {
                    //set selected position to 0
                    MDArray[row][col] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(MDArray));
    }

    /**
     * Increases the number of rows and columns in the existing multidimensional array by the given value.
     * @param factor the number of additional rows and columns to be added to the existing multidimensional array
     */
    void expandArray(int factor) {

        //create array of new size
        int[][] output = new int[MDArray.length + factor][MDArray[0].length + factor];

        for (int i = 0; i < MDArray.length; i++) {

            for (int j = 0; j < MDArray[i].length; j++) {
//copy original array
                output[i][j] = MDArray[i][j];
            }
        }

        MDArray = output;
        System.out.println(Arrays.deepToString(MDArray));
    }

    /**
     * Decreases the number of rows and columns in the existing multidimensional array by the given value.
     * @param factor the number of rows and columns to be subtracted from the existing multidimensional array
     */
    void shrink(int factor) {

        //create array of new size
        int[][] output = new int[MDArray.length - factor][MDArray[0].length - factor];

        for (int i = 0; i < output.length; i++) {

            for (int j = 0; j < output[i].length; j++) {
//copy original array
                output[i][j] = MDArray[i][j];
            }
        }

        MDArray = output;
        System.out.println(Arrays.deepToString(MDArray));

    }

    /**
     * Returns the maximum value contained in the multidimensional array and prints the result to the console.
     * @return the maximum value contained in the multidimensional array
     */
    public int getMaxValue() {

        int maxValue = MDArray[0][0];
       // loop through array and set each larger value to max
        for (int j = 0; j < MDArray.length; j++) {

            for (int i = 0; i < MDArray[j].length; i++) {

                if (MDArray[j][i] > maxValue) {

                    maxValue = MDArray[j][i];
                }
            }
        }

        System.out.println(maxValue);
        return maxValue;
    }

    /**
     * Returns the minimum value contained in the multidimensional array and prints the result to the console.
     * @return the minimum value contained in the multidimensional array
     */
    public int getMinValue() {

        int minValue = MDArray[0][0];
        // loop through array and set each smaller value to min
        for (int j = 0; j < MDArray.length; j++) {

            for (int i = 0; i < MDArray[j].length; i++) {

                if (MDArray[j][i] < minValue) {
                    minValue = MDArray[j][i];
                }
            }
        }

        System.out.println(minValue);
        return minValue;
    }
}
