/*

Problem Statement: Given an integer. Write a program to reverse digits of a number.

Examples:

Example 1:
Input: N = 472
Output: 274
Explanation: Reading the number from back to front, we see that the output should be 274

Example 2:
Input: N = 470
Output: 74
Explanation: Reading the number from back to front, we get 074. For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74

*/

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int res = reverse(n);
        System.out.print(res);
    }

    private static int reverse(int n)
    {
        int rev=0;

        while(n!=0)
        {
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }

        return rev;
    }
}
