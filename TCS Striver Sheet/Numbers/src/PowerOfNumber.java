/*

Problem Statement: Given a number N, return all primes till N.

Examples
Example 1:
Input:x = 2, n = 5
Output:32
Explanation: Calculate pow(2, 5) = 25 = 2*2*2*2*2 = 32
Example 2:
Input:x = 21, n = 2
Output: 441
Explanation:  Calculate pow(21, 2) = 212 = 21*21 = 441

*/

import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();

        int ans = power(x,n);

        System.out.print(ans);
    }

    private static int power(int x, int n)
    {
        int p = 1;
        for(int i=1;i<=n;i++)
        {
            p = p * x;
        }

        return p;
    }
}
