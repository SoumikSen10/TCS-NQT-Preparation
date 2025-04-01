/*

Given two integers, find sum of cubes of all numbers in the range between n and m.

I/O : n = 4, m = 9
O/P : 1989

*/

import java.util.Scanner;

public class SumOfCubes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        int ans = compute(start,end);
        System.out.print(ans);

    }

    private static int compute(int start, int end)
    {
        int sum = 0;

        for(int i = start;i <= end; i++)
        {
            sum = sum + (i*i*i);
        }

        return sum;
    }
}
