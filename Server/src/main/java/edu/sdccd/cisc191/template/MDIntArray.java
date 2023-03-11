package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class MDIntArray {


    int[][] MDArray;

    //set array
    MDIntArray(int[][] nums) {

        MDArray = nums;
    }

    int getAtIndex(int row, int col) {

        System.out.println(MDArray[row][col]);
        return MDArray[row][col];
    }

    void setAtIndex(int row, int col, int newValue) {

        MDArray[row][col] = newValue;
        System.out.println(Arrays.deepToString(MDArray));
    }

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

    void printAll() {
        // Loop through all rows
        for (int i = 0; i < MDArray.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < MDArray[i].length; j++) {

                System.out.print(MDArray[i][j] + " ");
            }
        }
    }

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
