/*

Problem Statement: Given an integer, find the sum of digits of that integer.

Examples:

Example 1:
Input: N = 472
Output: 13
Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

Example 2:
Input: N = 102
Output: 3
Explanation: The digits in the number are 0, 1, and 2. Summing them up gives us a value of 3

*/

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = sumOfDigits(n);
        System.out.print(ans);
    }

    private static int sumOfDigits(int n)
    {
        int s = 0;

        while(n!=0)
        {
            int d = n%10;
            s = s + d;
            n = n/10;
        }

        return s;
    }
}
