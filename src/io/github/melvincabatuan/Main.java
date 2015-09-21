package io.github.melvincabatuan;

import java.util.Scanner;

public class Main {

    private static int choice;

    public static void main(String[] args) {

        // Main menu
        for(;;) {

            // Display menu and get selection
            getSelection();

            if (choice == 1) {
                Store store = new Store();
                store.inputPrices();
                store.addConstant(5);
                store.computeTotal();
                store.printPrices();
            }

            else if (choice == 2){
                AverageGPA averagegpa = new AverageGPA();
                averagegpa.inputGPA();
                averagegpa.computeAverage();
                averagegpa.printGPAs();
            }

            else if (choice == 3){
                Division division = new Division();
                division.printDivision();
            }

            else if (choice == 4){
                Equation equation = new Equation();
                equation.solveX();
                equation.printX();
            }

            else if (choice == 5){
                Circle circle = new Circle();
                circle.inputRadius();
                circle.calculateArea();
                circle.printArea();
            }

            else if (choice == 6){
                Sphere sphere = new Sphere();
                sphere.inputRadius();
                sphere.calculateArea();
                sphere.calculateVolume();
                sphere.printResult();
            }

            else if (choice == 7){
                WeekDay weekday = new WeekDay();
                weekday.inputDate();
                weekday.computeDay();
                weekday.printDay();
            }

            else if (choice == 99){
                System.out.println("Exiting now...");
                break;
            }

            else {
                System.out.println("Invalid input! Please try again or Enter 99 to exit.");
            }

        }// ENDFOR MENU

    }// END MAIN


    public static void getSelection(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("                     Main Menu                                  ");
        System.out.println("================================================================");
        System.out.println("   1. Store.java  ");
        System.out.println("   2. AverageGPA.java  ");
        System.out.println("   3. Division.java ");
        System.out.println("   4. Equation.java ");
        System.out.println("   5. Circle.java ");
        System.out.println("   6. Sphere.java ");
        System.out.println("   7. WeekDay.java ");
        System.out.println("   99. Exit ");
        System.out.println("================================================================");
        System.out.print("   >> ");

        choice = keyboard.nextInt(); // get the selected option
    }
}
