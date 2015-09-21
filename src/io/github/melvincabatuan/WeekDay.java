package io.github.melvincabatuan;

import java.util.Scanner;

/**
 * Determines the day of the week (Sunday through Saturday) given any date entered by the user.
 * Created by cobalt on 9/21/15.
 */
public class WeekDay {

    // Input
    private int day;
    private int month;
    private int year;
    private int century;

    // Output
    private int d_out;

    public void inputDate(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input the day: ");
        day = keyboard.nextInt();
        System.out.print("Input the month: ");
        month = keyboard.nextInt();

        if (month == 1)
            month = 13;
        else if (month == 2)
            month = 14;

        System.out.print("Input the year: ");
        int temp_year = keyboard.nextInt();
        year = ((temp_year/10)%10)*10 + temp_year%10;
        // System.out.println("year = " + year);       // Debug logging
        century = ((temp_year/1000)%10)*10 + (temp_year/100)%10;
        // System.out.println("century = " + century); // Debug logging
    }

    public void computeDay(){
        d_out = (day + (int)(26 *(month + 1)/10.0) + year + (int)(year/4.0) + (int)(century/4.0) + 5 * century ) % 7;
    }

    public void printDay(){
        System.out.println("");
        switch(d_out) {
            case 0:
                System.out.println("It's Saturday!");
                break;
            case 1:
                System.out.println("It's Sunday!");
                break;
            case 2:
                System.out.println("It's Monday!");
                break;
            case 3:
                System.out.println("It's Tuesday!");
                break;
            case 4:
                System.out.println("It's Wednesday!");
                break;
            case 5:
                System.out.println("It's Thursday!");
                break;
            case 6:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
