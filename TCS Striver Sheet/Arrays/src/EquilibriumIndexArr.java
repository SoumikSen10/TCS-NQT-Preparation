/*

Problem Statement: Finding Equilibrium index in an array

Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. That is, nums[0] + nums[1] + ... + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + ... + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.

Examples:

Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

*/

import java.util.Scanner;

public class EquilibriumIndexArr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();

        int index = findEquilibrium(nums,n);
        System.out.print(index);
    }

    private static int findEquilibrium(int[] arr,int n)
    {
        int totalSum = 0;
        for(int i=0;i<n;i++)
            totalSum+=arr[i];

        int leftSum = 0, rightSum = totalSum;
        for(int i=0;i<n;i++)
        {
            rightSum = rightSum-arr[i];
            if(leftSum==rightSum)
                return i;
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
