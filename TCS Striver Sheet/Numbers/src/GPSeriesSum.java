/*

Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

a, first term
r, common ratio
n, number of terms
 Write a program to find the sum of the geometric Progression Series.

Examples:

Example 1:
Input: a=1 , r=0.5 , n=3
Output: 1.75
Explanation: The sum of given GP Series is 1.75

Example 2:
Input: a=3 , r=5 , n=2
Output: 18
Explanation: The sum of the given GP Series is 18

*/

import java.util.Scanner;

public class GPSeriesSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double r = in.nextDouble();
        double n = in.nextDouble();

        double sum = 0;

        if (r == 1)
            sum = a * n; // If r is 1, the sum is simply n * a
        else
            sum = a * (1 - Math.pow(r,n)) / (1-r);

        System.out.print(sum);

    }
}
