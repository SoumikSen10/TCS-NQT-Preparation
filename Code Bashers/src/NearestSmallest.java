/*

Given an array of integers, find the nearest smaller number for every element such that the smaller element is on the left side.

Input: {1, 6, 4, 10, 2, 5}
Output: {-1, 1, 1, 4, 1, 2}

Input 2 : {3, 2, 1}
Output 2 : {{-1, -1, -1}

 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int[] ans = compute(arr,n);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] compute(int arr[],int n)
    {
        int output[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        output[0]=-1;

        for(int i=1;i<n;i++)
        {
            while(stack.size()>0 && stack.peek()>=arr[i])
            {
                stack.pop();
            }

            if(stack.size()==0)
                output[i]=-1;
            else
                output[i]=stack.peek();

            stack.push(arr[i]);
        }
        return output;
    }
}
