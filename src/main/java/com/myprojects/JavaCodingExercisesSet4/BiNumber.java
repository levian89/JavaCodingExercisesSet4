package com.myprojects.JavaCodingExercisesSet4;

import java.util.Scanner;

public class BiNumber {

    private int number1;
    private int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public static int calculateLCM(int number1, int number2) {
        if (number1==0 || number2==0) {
            return 0;
        }

        if (number1 < 0 || number2 < 0) {
            return -1;
        }

        int max = Math.max(number1, number2);
        int lcm = max;

        while (lcm % number1 != 0 || lcm % number2 != 0) {
            lcm = lcm + max;
        }

        //or

//        while (true) {
//            if (lcm % number1 == 0 && lcm % number2 == 0) {
//                break;
//            }
//            lcm = lcm + max;
//        }
        return lcm;
    }

    public static int calculateGCD(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        if (number1 < 0 || number2 < 0) {
            return 1;
        }

        if (number1 == number2 ) {
            return number1;
        }

        int min = Math.min(number1, number2);
//        while (min >= 1) {
//            if (number1%min==0 && number2%min==0) {
//                break;
//            }
//            min--;
//        }
//        return min;

        //or

        for (int i = min; i>0; i--) {
            boolean isDivisorOfBothNumbers = number1%i==0 && number2%i ==0;
            if (isDivisorOfBothNumbers) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        BiNumber biNumber = new BiNumber(6,10);
        System.out.println(calculateLCM(6,10));
        System.out.println(calculateGCD(6,10));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("The least common multiple between the two numbers introduced is: " + calculateLCM(number1,number2));
        System.out.println("The greatest common divisor between the two numbers introduced is: " + calculateGCD(number1,number2));
    }
}