package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MDArrayTest {

    int[][] testArray = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
    MDIntArray testIntArray = new MDIntArray(testArray);

    @Test
    void getAtIndexTest() {

        assertEquals(10, testIntArray.getAtIndex(1, 4));
    }

    @Test
    void setAtIndexTest() {

        assertEquals(10, testIntArray.MDArray[1][4]);

        testIntArray.setAtIndex(1, 4,20);

        assertEquals(20, testIntArray.MDArray[1][4]);
    }

    @Test
    void findIndexOfTest() {

        assertEquals("2,2", testIntArray.findIndex(13));
    }

    @Test
    void printAllTest() {
    }

    @Test
    void deleteAtIndexTest() {

        assertEquals(11, testIntArray.MDArray[2][0]);

        testIntArray.deleteAtIndex(2,0);

        assertEquals(0, testIntArray.MDArray[2][0]);
    }

    @Test
    void expandTest() {

        assertEquals(testArray, testIntArray.MDArray);

        testIntArray.expandArray(2);

        assertEquals(0, testIntArray.MDArray[3][5]);
    }

    @Test
    void shrinkTest() {

        assertEquals(testArray, testIntArray.MDArray);

        testIntArray.shrink(2);

        assertEquals(1, testIntArray.MDArray[0][0]);
    }

    @Test
    void maxTest() {

        assertEquals(15, testIntArray.getMaxValue());
    }

    @Test
    void minTest() {

        assertEquals(1, testIntArray.getMinValue());
    }

}