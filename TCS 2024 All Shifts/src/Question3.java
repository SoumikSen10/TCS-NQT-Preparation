/*

Problem Statement:

Given two integers, M and N, calculate the sum of the cubes of all integers from M to N inclusive. If M is greater than N, the result should be zero or an appropriate message should be displayed.

Input Format:

The input will consist of two integers, M and N, where M and N could be any integer, positive or negative.

Output Format:

Output a single integer representing the sum of the cubes of all integers from M to N inclusive.

Example:

Input:

M = 2 N = 4

Output:

99

Explanation: The sum of the cubes of 2, 3, and 4 is 8 + 27 + 64 = 99.

*/

import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();


        if(M>N)
            System.out.print("Not Possible");
        else
            System.out.print(findSum(M,N));

    }

    private static int findSum(int M,int N)
    {
        int sum = 0;

        for(int i=M;i<=N;i++)
        {
            sum = sum + (i*i*i);
        }

        return sum;
    }
}
