/*

# Question :

Given an array of integers, find an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. If no such index exists, return -1.

For example, consider the array [-7, 1, 5, 2, -4, 3, 0]

Index 3 is an equilibrium index because the sum of elements on the left, -7+1+5=-1, is equal to the sum of elements on the right, -4+3+0=-1.

*/

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int index = findEquilibrium(arr,n);
        System.out.println(index);
    }

    private static int findEquilibrium(int[] arr,int n)
    {
        int left[] = new int[n];
        int right[] = new int[n];

        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            left[i]=leftSum;
            leftSum+=arr[i];
        }

        int rightSum=0;
        for(int i=n-1;i>=0;i--)
        {
            right[i]=rightSum;
            rightSum+=arr[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int i=0;i<n;i++)
        {
            if(left[i]==right[i])
                return i;
        }

        return -1;

    }

}
