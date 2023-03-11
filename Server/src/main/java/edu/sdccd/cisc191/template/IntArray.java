package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class IntArray {

    int[] array;

    //Take in int[]
    IntArray(int[] nums) {
        array = nums;
    }

    //Print
    int getAtIndex(int index) {

        System.out.println(array[index]);
        return array[index];
    }

    void setAtIndex(int index, int newValue) {

        array[index] = newValue;
        System.out.println(Arrays.toString(array));
    }

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

    void printAll() {

        for (int element : array) {

            System.out.println(element);
        }
    }

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

    public void expand() {

        int[] newArray = new int[array.length + 1];
        // copy into new array from start of array
        System.arraycopy(array, 0, newArray, 0, array.length);

        array = newArray;

        System.out.println(Arrays.toString(newArray));
    }

    void shrink(int size) {

        int[] newArray = new int[size];
        // copy into new array from start of array
        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;

        System.out.println(Arrays.toString(newArray));
    }
//sort array and get last index
    int max() {

        Arrays.sort(array);

        System.out.println(array[array.length - 1]);

        return array[array.length - 1];

    }
//sort array and get first index
    int min() {

        Arrays.sort(array);

        System.out.println(array[0]);

        return array[0];
    }
}
