package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class Drink implements Edible {

    float sugar;
    int weight;

    float totalPrice;

    String[] drinks = new String[2];

    public void printPrice() {

        for (int row = 0; row < drinks.length; row++) {
            if (drinks[row]==null) {
                continue;
            }
                if (drinks[row].equals("Water")) {
                    totalPrice += 1;
                }
                if (drinks[row].equals("Pepsi")) {
                    totalPrice += 3;
                }
            }

        System.out.println(totalPrice);

    }

    public void printArray(){

        System.out.println(Arrays.toString(drinks));
    }
    public void addWater(){

        drinks[0] = "Water";
    }
}
