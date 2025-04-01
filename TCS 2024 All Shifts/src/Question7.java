/*

Write a function called ‘sum fibonacci that takes a single integer ‘n’ (where 1 <= n <= 50 ) as input and returns the sum of the first ‘n terms of the Fibonacci sequence.

The Fibonacci sequence is defined as follows:

F(0) = 0

F(1) = 1

F(n) = F(n – 1) + F(n – 2) for n >= 2

Your task is to calculate the sum of the first ‘n’ Fibonacci numbers, F (0) through F(n-1), and return this sum.

Example

Input: n= 5

Output: 7

Explanation : The first 5 fibonacci numbers :0,1,1,2,3 their sum 0+1+1+2+3=7

*/

import java.util.Scanner;

public class Question7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = calcFibo(n);
        System.out.print(ans);
    }

    private static int calcFibo(int n)
    {
        if(n==0)
            return 0;

        if(n==1)
            return 0;

        if(n==2)
            return 1;

        int prev2 = 0,prev1 = 1,curr,sum = 1;

        for(int i=2;i<n;i++)
        {
            curr = prev2 + prev1;

            sum = sum + curr;

            prev2 = prev1;
            prev1 = curr;
        }

        return sum;
    }
}
