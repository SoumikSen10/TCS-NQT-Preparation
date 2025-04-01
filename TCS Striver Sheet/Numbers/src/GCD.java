/*

Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.

Examples
Example 1:
Input:N1 = 9, N2 = 12

Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
Example 2:
Input:N1 = 20, N2 = 15

Output: 5
Explanation:Factors of 20: 1, 2, 4, 5
Factors of 15: 1, 3, 5
Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

*/

import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int ans = find_gcd(a,b);
        System.out.print(ans);

    }

    private static int find_gcd(int a, int b)
    {
       int gcd =  1, min = Math.min(a,b);

       for(int i = 1; i <= min; i++)
       {
           if(a%i == 0 && b%i == 0)
               gcd = i;
       }

       return gcd;
    }

    private static int euclidean_gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

    private static int find_gcdEuclidean(int a, int b)
    {
        if(b == 0)
            return a;
        return find_gcdEuclidean(b, a%b);
    }
}
