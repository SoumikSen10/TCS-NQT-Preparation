/*

Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

Examples:

Examples:
Input: 2 10
Output: 2 3 5 7
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.

*/

import java.util.Scanner;

public class PrimeRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();

        for(int i=min;i<=max;i++)
        {
            if(primeCheck(i))
                System.out.print(i+" ");
        }
    }

    private static boolean primeCheck(int n)
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
