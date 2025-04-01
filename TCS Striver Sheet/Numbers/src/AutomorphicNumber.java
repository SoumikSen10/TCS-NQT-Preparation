/*

Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples:

Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

*/

import java.util.Scanner;

public class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(checkAutomorphic(n))
            System.out.print("Automorphic Number");
        else
            System.out.print("Not Automorphic Number");
    }

    private static boolean checkAutomorphic(int n)
    {
        int square = n*n;

        while(n!=0)
        {
            if(n % 10 != square % 10)
                return false;

            n = n/10;
            square = square/10;

        }

        return true;
    }
}
