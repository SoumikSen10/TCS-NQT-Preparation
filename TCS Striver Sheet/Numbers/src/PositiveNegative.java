/*

Problem statement: Given a number n check whether it's positive or negative.

Examples:

Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative

*/

import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n<0)
            System.out.print("Negative");
        else
            System.out.print("Positive");

    }
}
