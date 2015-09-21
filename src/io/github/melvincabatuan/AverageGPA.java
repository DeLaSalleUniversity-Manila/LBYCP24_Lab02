package io.github.melvincabatuan;

import java.util.Scanner;

/**
 * Compute and print the average
 * Created by cobalt on 9/21/15.
 */
public class AverageGPA {

    private double firstGPA;
    private double secondGPA;
    private double thirdGPA;
    private double average;

    public void inputGPA() {

        // Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Declare and Input value
        System.out.print("\nInput first GPA: ");
        firstGPA = keyboard.nextDouble();
        System.out.print("\nInput second GPA: ");
        secondGPA = keyboard.nextDouble();
        System.out.print("\nInput third GPA: ");
        thirdGPA =keyboard.nextDouble();
    }

    public void computeAverage(){
        average = (firstGPA + secondGPA + thirdGPA)/ 3;
    }

    public void printGPAs(){
        System.out.println("\nfirstGPA = " + firstGPA);
        System.out.println("secondGPA = " + secondGPA);
        System.out.println("thirdGPA = " + thirdGPA);
        System.out.println("");
        System.out.println("averageGPA = " + average);
        System.out.println("");
    }
}

