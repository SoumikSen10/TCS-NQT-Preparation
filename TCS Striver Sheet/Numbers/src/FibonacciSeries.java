/*

Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Examples:

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

*/

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        computeFibSeries(n);
    }

    private static void computeFibSeries(int n)
    {
        if(n<0)
        {
            System.out.print("Invalid");
            return;
        }

        if(n==0)
        {
            System.out.print(0);
            return;
        }

        int secondLast = 0;
        int last = 1;

        System.out.print(secondLast);

        if(n>=1)
            System.out.print(" " + last);

            int curr=0;

            for(int i=2;i<=n;i++)
            {
                curr = secondLast + last;
                System.out.print(" " + curr);
                secondLast = last;
                last = curr;
            }
    }
}
