package com.pluralsight;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int total = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + total);

            switch (total) {
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 7 -> sevenCounter++;
            }
        }

        System.out.println();
        System.out.println("Final Results (out of 100 rolls)");
        System.out.println("Number of times sum was 2: " + twoCounter);
        System.out.println("Number of times sum was 4: " + fourCounter);
        System.out.println("Number of times sum was 6: " + sixCounter);
        System.out.println("Number of times sum was 7: " + sevenCounter);
    }
}