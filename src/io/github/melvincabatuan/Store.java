package io.github.melvincabatuan;

import java.util.Scanner;

/**
 * Created by cobalt on 9/21/15.
 */
public class Store {

    private double firstItem;
    private double secondItem;
    private double thirdItem;
    private double totalPrices;

    public void inputPrices() {

        // Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Declare and Input value
        System.out.print("\nInput first item price: ");
        firstItem = keyboard.nextDouble();
        System.out.print("\nInput second item price: ");
        secondItem = keyboard.nextDouble();
        System.out.print("\nInput third item price: ");
        thirdItem =keyboard.nextDouble();
    }

    public void addConstant(int x){
        firstItem  = firstItem + x;
        secondItem = secondItem + x;
        thirdItem  = thirdItem  + x;
    }

    public void computeTotal(){
        totalPrices = firstItem + secondItem + thirdItem;
    }

    public void printPrices(){
        System.out.println("\nfirstItem = " + firstItem);
        System.out.println("secondItem = " + secondItem);
        System.out.println("thirdItem = " + thirdItem);
        System.out.println("");
        System.out.println("totalPrices = " + totalPrices);
        System.out.println("");
    }
}
