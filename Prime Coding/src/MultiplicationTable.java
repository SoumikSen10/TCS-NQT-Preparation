/*

Given an integer, we need to find the sum of values of that table.

I/P : 10
O/P : 550

Example : 10 * 1 + 10 * 2 + ... + 10 * 10 = 550

*/

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        compute(n);
    }

    private static void compute(int n)
    {
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            sum = sum + (n*i);
        }

        System.out.print(sum);
    }
}
