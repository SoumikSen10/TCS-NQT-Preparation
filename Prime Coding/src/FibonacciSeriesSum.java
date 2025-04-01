/*

Calculate the sum of N terms of fibonacci series.

Note : fib(0) = 1 and fib(1) = 1

Input : n = 5
Output : 7
 Indexes :    0 1 2 3 4 5 6
Explanation : 0 1 1 2 3 5 8

*/

import java.util.Scanner;

public class FibonacciSeriesSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int ans = fibo(n);
        System.out.print(ans);
    }

    private static int fibo(int n)
    {

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        if(n==2)
            return 1;


        int prev2 = 0 , prev1 = 1 , curr = 0, sum = 1;

        for(int i = 2;i < n; i++)
        {
            curr = prev2 + prev1;
            sum = sum + curr;

            prev2 = prev1;
            prev1 = curr;

        }
        return sum;
    }
}
