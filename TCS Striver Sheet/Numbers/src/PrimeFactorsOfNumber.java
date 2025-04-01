/*

Problem Statement: Given an integer N, print all of its prime factors.

Examples
Example 1:
Input: N=60
Output: 2, 3, 5
Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
Example 2:
Input: N=35
Output: 5, 7
Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime.

*/

import java.util.Scanner;

public class PrimeFactorsOfNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        primeFactors(n);
    }

    private static void primeFactors(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(n%i == 0)
            {
                if(checkPrime(i))
                    System.out.print(i+" ");
            }

        }
    }

    private static boolean checkPrime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
