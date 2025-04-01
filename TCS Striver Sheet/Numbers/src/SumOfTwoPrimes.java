/*

Problem: Given a number n, express the number as a sum of 2 prime numbers.

Examples:

Example 1:
Input : N = 74
Output : True .
Explanation: 74 can be expressed as 71 + 3 and both are prime numbers.

Example 2:
Input : N = 11
Output : False.
Explanation: 11 cannot be expressed as sum of two prime numbers.

*/

import java.util.Scanner;

public class SumOfTwoPrimes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(check(n))
            System.out.print("True");
        else
            System.out.print("False");
    }

    private static boolean check(int n)
    {
        if(n<4) // Smallest sum of two primes is 2+2=4
            return false;

        // Try all numbers from 2 to n/2 and check if both are prime
        for(int i=2;i<=n/2;i++)
        {
            if (prime(i) && prime(n - i))
                return true; // Found two primes whose sum is n
        }

       return false;
    }

    private static boolean prime(int n)
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

/*

Intuition

A prime number (odd) cannot be expressed as the sum of two odd primes, since an odd + odd = even.

Therefore, if n is odd, it cannot be written as the sum of two primes (except 2 + 9 type cases, but 9 is not prime).

If n is even, we need to find two prime numbers i and n-i, such that both are prime.

*/