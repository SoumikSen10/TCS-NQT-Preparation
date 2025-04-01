/*

Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

Examples:

Example 1:
Input: min = 10 , max = 50
Output: 11 22 33 44
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

Example2:
Input: min = 100 , max = 150
Output: 101 111 121 131 141
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

*/

import java.util.Scanner;

public class PalindromeRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();

        for(int i=min;i<=max;i++)
        {
            if(palinCheck(i))
                System.out.print(i+" ");
        }
    }

    private static boolean palinCheck(int n)
    {
        int x = n,rev=0;

        while(n!=0)
        {
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }

        return x==rev;
    }
}
