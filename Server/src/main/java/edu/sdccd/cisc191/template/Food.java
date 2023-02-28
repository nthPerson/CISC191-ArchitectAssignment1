package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class Food implements Edible {

    float protein;
    float vitamins;
    float totalPrice = 0;
    String[][] food = new String[2][2];

    public void printArray() {
        for (int row = 0; row < food.length; row++) {
            for (int col = 0; col < food[row].length; col++) {
                System.out.print(food[row][col]);
            }
        }
        System.out.println();
    }

    public void printPrice() {

        for (int row = 0; row < food.length; row++) {
            for (int col = 0; col < food[row].length; col++) {
                if (food[row][col] == null) {
                    continue;
                }
                if (food[row][col].equals("Cake")) {
                    totalPrice += 10;
                }
                if (food[row][col].equals("Ice Cream")) {
                    totalPrice += 5;
                }
                if (food[row][col].equals("Pizza")) {
                    totalPrice += 7;
                }
                if (food[row][col].equals("Pasta")) {
                    totalPrice += 15;
                }
            }
        }
        System.out.println(totalPrice);
    }

    public void addCake() {

        food[0][0] = "Cake";
    }
}
