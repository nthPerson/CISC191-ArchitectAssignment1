package edu.sdccd.cisc191.template;

public class MDIntArray {
    //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink

    int[][] MDArray;

    MDIntArray(int[][] nums) {
        MDArray = nums;
    }

    int getAtIndex(int row, int col) {
        return MDArray[row][col];
    }

    void setAtIndex(int row, int col, int newValue) {
        MDArray[row][col] = newValue;
    }

    public int[] findIndex(int num) {


        for (int i = 0; i < MDArray.length; i++) {
            for (int j = 0; j < MDArray[i].length; j++) {
                if (MDArray[i][j] == num) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
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

        for (int i = 0; i < MDArray.length; i++) {
            for (int j = 0; j < MDArray[i].length; j++) {
                if (MDArray[i][j] == MDArray[row][col]) {
                    MDArray[row][col] = 0;
                }
            }
        }
    }

    void expandArray(int factor) {
        int[][] output = new int[MDArray.length + factor][MDArray[0].length + factor];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                int orgRow = i / ((MDArray.length - 1) + factor);
                int orgCol = j / ((MDArray[0].length - 1) + factor);
                output[i][j] = MDArray[orgRow][orgCol];
            }
        }

        MDArray = output;
    }

    void shrink(int factor) {
        int[][] output = new int[MDArray.length - factor][MDArray[0].length - factor];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                int orgRow = i / ((MDArray.length - 1) - factor);
                int orgCol = j / ((MDArray[0].length - 1) - factor);
                output[i][j] = MDArray[orgRow][orgCol];
            }
        }

        MDArray = output;

    }

    public int getMaxValue() {
        int maxValue = MDArray[0][0];
        for (int j = 0; j < MDArray.length; j++) {
            for (int i = 0; i < MDArray[j].length; i++) {
                if (MDArray[j][i] > maxValue) {
                    maxValue = MDArray[j][i];
                }
            }
        }
        return maxValue;
    }

    public int getMinValue() {
        int minValue = MDArray[0][0];
        for (int j = 0; j < MDArray.length; j++) {
            for (int i = 0; i < MDArray[j].length; i++) {
                if (MDArray[j][i] < minValue) {
                    minValue = MDArray[j][i];
                }
            }
        }
        return minValue;
    }
}
