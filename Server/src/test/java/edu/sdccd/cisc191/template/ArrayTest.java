package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {
    //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink, max, min
    int[] testArray = new int[]{1, 2, 3, 4, 5};
    IntArray testIntArray = new IntArray(testArray);

    @Test
    void getAtIndexTest() {

        assertEquals(3, testIntArray.getAtIndex(2));
    }

    @Test
    void setAtIndexTest() {

        assertEquals(3, testIntArray.array[2]);
        testIntArray.setAtIndex(2, 10);
        assertEquals(10, testIntArray.array[2]);
    }

    @Test
    void findIndexOfTest() {

        assertEquals(3,testIntArray.findIndex(4));
    }

    @Test
    void printAllTest() {
    }

    @Test
    void deleteAtIndexTest() {
        assertEquals(4, testIntArray.array[3]);
        testIntArray.deleteAtIndex(3);
        assertEquals(5,testIntArray.array[3]);
    }

    @Test
    void expandTest() {

        assertEquals(testArray, testIntArray.array);
        testIntArray.expand();
        assertEquals(0, testIntArray.array[5]);
    }

    @Test
    void shrinkTest() {
        assertEquals(testArray, testIntArray.array);
        testIntArray.shrink(4);
        assertEquals(1, testIntArray.array[0]);
    }

    @Test
    void maxTest() {
        assertEquals(5,testIntArray.max());
    }

    @Test
    void minTest() {
        assertEquals(1,testIntArray.min());
    }

}