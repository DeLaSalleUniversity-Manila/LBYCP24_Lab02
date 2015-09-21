package io.github.melvincabatuan;

import java.util.Scanner;

/**
 * Calculates and prints the surface area of the sphere and its volume
 * Created by cobalt on 9/21/15.
 */
public class Sphere {

    private final double PI = 3.14159;
    private double radius = 3;              // default value
    private double surfaceArea;
    private double volume;

    public void inputRadius(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number radius of the sphere: ");
        radius = keyboard.nextDouble();
    }

    public void calculateVolume(){
        volume = 4 * PI * Math.pow(radius,3)/ 3;
    }


    public void calculateArea(){
        surfaceArea = 4 * PI * Math.pow(radius,2);
    }

    public void printResult(){
        System.out.printf("\nThe surface area of the sphere of radius %.2f is %.2f.\n", radius, surfaceArea);
        System.out.printf("\nThe volume of the circle of radius %.2f is %.2f.\n", radius, volume);
    }
}
