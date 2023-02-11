package com.brideglabz.generics;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to generics");
        testMaxBetweenThreeIntegers();
    }

    public static void testMaxBetweenThreeIntegers() {

        Integer firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the Second number : ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter the Third number : ");
        thirdNumber = scanner.nextInt();

        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First number is grater");
            } else
                System.out.println("Third number is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second number is greater");
        else
            System.out.println("Third number is greater");
    }
}
