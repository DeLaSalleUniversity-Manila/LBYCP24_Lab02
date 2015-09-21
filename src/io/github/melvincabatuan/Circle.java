package io.github.melvincabatuan;

import java.util.Scanner;

/**
 * Calculate the area of a circle
 * Created by cobalt on 9/21/15.
 */
public class Circle {

    private final double PI = 3.14159;
    private double radius = 3;              // default value
    private double area;

    public void inputRadius(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number radius of the circle: ");
        radius = keyboard.nextDouble();
    }

    public void calculateArea(){
        area = PI*Math.pow(radius,2);
    }

    public void printArea(){
        System.out.printf("\nThe area of the circle is %.2f.\n", area);
    }
}
