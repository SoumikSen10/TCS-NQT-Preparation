/*

Given an integer, we need to find the sum of values of that table.

Input:10

Output:550

Explanation: 10*1+10*2+…..10*10

*/

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = compute(n);
        System.out.print(ans);
    }

    private static int compute(int n)
    {
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum = sum + (n*i);
        }

        return sum;
    }
}
