/*

Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

a = first term of A.P.

d= common Difference of A.P.

n= Number of Terms in  A.P.

Examples:

Example 1:
Input:
n=4
a=2
d=2
Output: 20
Explanation: 2+4+6+8 = 20

Input:
n=8
a=2
d=5
Output: 124
Explanation: 2 + 7 + 12 + 17 + 22 + 27 + 32 + 37 = 156

*/

import java.util.Scanner;

public class APSeriesSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int d = in.nextInt();

        int sum = (n * (2 * a + (n-1) * d))/2;
        System.out.print(sum);

    }
}
