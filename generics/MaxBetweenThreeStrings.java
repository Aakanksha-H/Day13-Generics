package com.brideglabz.generics;

import java.util.Scanner;

public class MaxBetweenThreeStrings {
    public void testMaxBetweenThrStrings() {

        String firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        firstNumber = scanner.nextLine();

        System.out.print("Enter the Second string : ");
        secondNumber = scanner.nextLine();

        System.out.print("Enter the Third string : ");
        thirdNumber = scanner.nextLine();

        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First string is greater");
            } else
                System.out.println("Third string is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second string is greater");
        else
            System.out.println("Third string is greater");
    }
}
