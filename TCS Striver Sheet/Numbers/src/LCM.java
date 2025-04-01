/*

Problem Statement: Find lcm of two numbers.

Examples:

Example 1:
Input: num1 = 4,num2 = 8
Output: 8


Example 2:
Input: num1 = 3,num2 = 6
Output: 6

*/

import java.util.Scanner;

public class LCM
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int ans = find_lcm(a,b);

        System.out.print(ans);
    }

    private static int find_lcm(int a, int b)
    {
        return (a * b)/find_gcd(a,b);
    }

    private static int find_gcd(int a, int b)
    {
        int gcd = 1;

        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }

        return gcd;
    }

    private static int euclidean_gcd(int a, int b)
    {
        if(b == 0)
            return a;

        return euclidean_gcd(b,a%b);
    }
}
