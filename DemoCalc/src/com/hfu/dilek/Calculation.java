package com.hfu.dilek;

public class Calculation {

    public static void main(String[] args) {

        System.out.println("Beginn with mathematics");

        additionStep();

        multipStep  ();
    }

    private static void additionStep() {

        for (int i = 0; i < 5; i++) {

            int random = createRandom();
            System.out.println("Counter i =  " + i + ", Random number " + random + ",  Addition: " + (i + random));
        }

        System.out.println("Ende");
    }

    private static void multipStep() {

        for (int i = 0; i < 7; i++) {
            int random = createRandom();
            System.out.println("Counter i =  " + i + ", Random number " + random + ",  Multiply: " + (i * random));
        }

        System.out.println("");
        System.out.println("End of Multiply");
    }

    private static int createRandom() {
        // minimum 1 and maximum 50
        int random = (int) (Math.random() * 50 + 1);
        return random;
    }
}


