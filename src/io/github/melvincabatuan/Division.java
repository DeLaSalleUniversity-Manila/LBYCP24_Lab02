package io.github.melvincabatuan;

/**
 * Exercise 3
 * Created by cobalt on 9/21/15.
 */
public class Division {

    private int a = 18;
    private int b = 4;

    public void printDivision(){
        System.out.printf(" \n Given: a = %d; b = %d ", a,b);
        System.out.printf(" \n the quotient of dividing a by b is %d, \n the remainder of dividing a by b is %d, and ..." +
                "\n the result in floating point of dividing a by b is %.2f.\n", a/b, a % b, (float) a / b);
    }

}
