/*

Problem Statement: Given a number n, check whether a given number is even or odd.

Examples:

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.

Example 2:
Input: n=6
Output: even
Explanation: 6 is divisible by 2.

*/

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        if(n%2==0)
//            System.out.print("even");
//        else
//            System.out.print("odd");

        if((n&1)==0)
            System.out.print("even");
        else
            System.out.print("odd");

    }
}
