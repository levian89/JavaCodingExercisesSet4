package com.myprojects.JavaCodingExercisesSet4;

import java.util.Scanner;

public class NumberUtils {

    public static int calculateFactorial(int number) {
        if (number<0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *=  i;
        }
        return factorial;
    }

    public static int getLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        return number%10;
    }

    public static int getNumberOfDigits(int number) {

        if(number == 0) {
            return 1;
        }
        int noOfDigits = 0;
        while (number < 0) {
            number = number / 10;
            noOfDigits++;
        }
        // 2455    2455/10 = 245

        while (number > 0) {
            number = number / 10; // remove the last digit from the number
            noOfDigits++;
        }
        return noOfDigits;
    }

    public static int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        // 12345   -> 12345 % 10 = 5 ; sum = 0 + 5; number = 12345/10 -> 1234; 1234%10=4; sum = 5 + 4;

        int sumOfDigits = 0;
        while (number > 0 ) {
            int lastDigit = number%10;
            sumOfDigits = sumOfDigits + lastDigit;
            number = number/10;
        }
        return sumOfDigits;
    }

    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        //1234

        int reversedNumber = 0;
        while (number > 0) {   //1234, 123, 12, 1
            int lastDigit = number%10;  //4, 3, 2, 1
            reversedNumber = reversedNumber*10 + lastDigit; //4, 43, 432, 4321
            number = number/10;  //123, 12, 1, 0
//            System.out.format("lastDigit - %d, number - %d, reversedNumber - %d", lastDigit, number, reversedNumber).println();
        }
        return reversedNumber;
    }

    public static void main(String[] args) {

        System.out.println(calculateFactorial(5));
        System.out.println(getLastDigit(345));
        System.out.println(getNumberOfDigits(-234));
        System.out.println(getSumOfDigits(123));
        System.out.println(reverseNumber(12343));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println(number + "! is: " + calculateFactorial(number));
        System.out.println("Last digit of the number introduced is: " + getLastDigit(number));
        System.out.println("Number of digits for the number introduced is: " + getNumberOfDigits(number));
        System.out.println("Sum of digits for the number introduced is: " + getSumOfDigits(number));
        System.out.println("Reversed number for the number introduced is: " + reverseNumber(number));
    }
}