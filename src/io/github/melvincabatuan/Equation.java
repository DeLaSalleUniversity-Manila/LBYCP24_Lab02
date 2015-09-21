package io.github.melvincabatuan;

/**
 * Define and initialize the coefficients of a linear equation
 *  2x + 4.5 = 0
 * Created by cobalt on 9/21/15.
 */
public class Equation {
    private double x;
    private double coefficient_a = 2.0;
    private double coefficient_b = 4.5;

    public void solveX(){
        x = -coefficient_b/ coefficient_a;
    }

    public void printX(){
        System.out.println("The solution of the equation 2x + 4.5 = 0 is x = " + x );
    }
}
