/*

Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

Note :

When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number.
Strong number is also known as Krishnamurthi number/Peterson Number.
Examples:

Examples 1:
Input: N = 145
Output: Yes
Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number.

Example 2:
Input:  26
Output: No
Explanation: 2! + 6! = 722. Hence 26 is not a strong number.

*/

import java.util.Scanner;

public class StrongNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(checkStrong(n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    private static boolean checkStrong(int n)
    {
        int s = 0, x=n;

        while(n!=0)
        {
            int d = n%10;
            s = s + factorial(d);
            n = n/10;
        }

        return s==x;
    }

    private static int factorial(int n)
    {
        int fact = 1;

        for(int i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
}
