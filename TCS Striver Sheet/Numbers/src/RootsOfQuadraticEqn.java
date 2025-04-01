/*

Problem Statement: The standard form of a quadratic equation is:

ax2 + bx + c = 0, where a, b and c are real numbers and a != 0

You have given a, b, c of the equation, you have found the roots of the equation.

Examples:

Example 1:
Input: a = 1, b = -3, c = -10
Output: Roots are real and different, i.e(5 , -2).

Example2:

Input: a = 1, b = 1, c = 1
Output: Roots are complex, i.e-(−0.50+i0.866,−0.50−i0.866).

*/

import java.util.Scanner;

public class RootsOfQuadraticEqn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close(); // Closing Scanner to prevent resource leaks

        compute(a, b, c);
    }

    private static void compute(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Invalid input, 'a' cannot be 0");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            // One repeated real root
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal: (" + root + " , " + root + ")");
        } else if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: (" + root1 + " , " + root2 + ")");
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-discriminant) / (2 * a); // Corrected imaginary part calculation

            // Formatting output for complex roots
            System.out.printf("Roots are complex: (%.2f + i%.3f , %.2f - i%.3f)%n", realPart, imagPart, realPart, imagPart);
        }
    }
}


