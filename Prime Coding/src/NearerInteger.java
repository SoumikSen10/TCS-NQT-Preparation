/*

Write a program to take input of X and Y in a new line. Print the number which is nearer the integer when divided by Y.

Example 1 :

Input :
X = 13
Y = 3

Output : 12

Example 2 :

Input :
X = 13
Y = 3

Output : 12

*/

import java.util.Scanner;

public class NearerInteger
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();

        int ans = computeTrial(X,Y);
        System.out.print(ans);
    }

    private static int computeTrial(int x, int y)
    {
        int lower = 0;

        // Find the largest multiple of Y that is <= X
        while(lower + y <= x)
        {
            lower += y;
        }

        int upper = lower + y;

        // Return the closer multiple
        return (upper - x < x - lower) ? upper : lower;

    }

    private static int compute(int x, int y)
    {
        int lower = 0;

        // Find the largest multiple of Y that is <= X
        while(lower + y <= x)
        {
            lower += y;
        }

        // Find the next multiple of Y above X
        int upper = lower + y;

        // Return the closer multiple
        return (x - lower <= upper - x) ? lower : upper;
    }

    private static int computeOptimized(int x, int y)
    {
        int lower = (x / y) * y;
        // Largest multiple of Y <= X

        int upper = lower + y;
        // Smallest multiple of Y >= X

        return (x - lower <= upper - x) ? lower : upper;
    }
}
