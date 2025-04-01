/*

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Examples
Example 1:
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
Example 2:
Input:N = 7789
Output: Not Palindrome
Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

*/

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean check = palinCheck(n);

        if(check)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");

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

        return x == rev;

    }
}
