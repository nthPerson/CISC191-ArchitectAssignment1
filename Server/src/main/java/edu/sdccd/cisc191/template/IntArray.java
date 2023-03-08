package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class IntArray {
    //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink
    int[] array;

    IntArray(int[] nums) {
        array = nums;
    }

    int getAtIndex(int index) {
        return array[index];
    }

    void setAtIndex(int index, int newValue) {
        array[index] = newValue;
    }

    public int findIndex(int num) {

        // if array is Null
        if (array == null) {
            return -1;
        }

        // find length of array
        int len = array.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is num
            // then return the index
            if (array[i] == num) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    void printAll() {
        for (int element : array) {
            System.out.println(element);
        }
    }

    void deleteAtIndex(int index) {

        int[] array_new = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i != index) {
                array_new[k] = array[i];
                k++;
            }
        }
    }

    public void expand() {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);

        //an alternative to using System.arraycopy would be a for-loop:
        // for(int i = 0; i < OrigArray.length; i++)
        //     newArray[i] = OrigArray[i];
        array = newArray;
    }

    void shrink(int size) {

        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = null;
        System.out.println(Arrays.toString(newArray));
    }

    int max() {
        Arrays.sort(array);

        return array[array.length - 1];

    }

    int min() {
        Arrays.sort(array);


        return array[0];
    }
}
