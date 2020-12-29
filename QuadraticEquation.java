/**
 *Program to solve a quadratic equation using exception handling.
 *
 *
 * @author Jayakrishnan V R
 * @version 1.0
 * @since 2020-11-27
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuadraticEquation {
    // Function to find and display the roots of the equation.
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;
        try {
            System.out.println("Enter the coefficients of the quadratic equation");//Reading the values
            System.out.print("a:");
            a = Double.parseDouble(br.readLine());
            System.out.print("b:");
            b = Double.parseDouble(br.readLine());
            System.out.print("c:");
            c = Double.parseDouble(br.readLine());
        }
        catch (Exception e) { //checking for exception
            System.out.println("An error occurred");
            return;
        }
        double determinant = Math.pow(b, 2) - 4 * a * c; //calculating (b*b)-4ac
        //Displaying outputs
        if (determinant > 0) {
            System.out.println("Roots are " + (-b + Math.sqrt(determinant)) / (2 * a) + " and " + (-b - Math.sqrt(determinant)) / (2 * a));
        }
        else if (determinant == 0) {
            System.out.println("Root is " + -b / (2 * a));
        }
        else {
            System.out.println("Roots are " + -b / (2 * a) + "+i " + Math.sqrt(-determinant) / (2 * a) + " and " + -b / (2 * a) + "-i" + Math.sqrt(-determinant) / (2 * a));
        }
    }
}
