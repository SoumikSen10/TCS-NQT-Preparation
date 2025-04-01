/*

Problem Statement: Perfect Number. Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself).

Examples:

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason:
For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+4+7+14) is equal to the respective numbers and for 15 it is not.

*/

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(checkPerfect(n))
            System.out.print(n+" is a perfect number");
        else
            System.out.print(n+" is not a perfect number");

    }

    private static boolean checkPerfect(int n)
    {
        if(n<=1)
            return false;

        int s=1; // 1 is always a divisor

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                s += i; // Add the divisor
                if(i!=n/i)
                    s += n/i; // Add the paired divisor
            }
        }

        return s==n;

    }
}
