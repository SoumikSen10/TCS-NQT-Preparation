/*

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 3,6 and 7 to represent the color red, white and blue respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input : nums = [3,6,3,7,6,3,7]
Output : 3 3 3 6 6 7 7

*/

import java.util.Scanner;

public class ColouredObjects
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        char[] arr = new char[n];

        for(int i=0;i<n;i++)
            arr[i] = in.next().charAt(0);

        sortOptimized(arr,n);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    private static void sort(char[] arr,int n)
    {
        int cnt3 = 0, cnt6 = 0, cnt7 = 0;

        for(char ch : arr)
        {
            if(ch == '3')
                cnt3++;
            else if(ch == '6')
                cnt6++;
            else if(ch == '7')
                cnt7++;
        }

        int index = 0;
        for(int i=0;i<cnt3;i++)
        {
            arr[index++] = '3';
        }

        for(int i=0;i<cnt6;i++)
        {
            arr[index++] = '6';
        }

        for(int i=0;i<cnt7;i++)
        {
            arr[index++] = '7';
        }

    }

    private static void sortOptimized(char[] arr, int n)
    {
        int left = 0,mid = 0,right = n-1;

        while(mid<=right)
        {
            if(arr[mid]=='3')
            {
                char temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }
            else if(arr[mid]=='6')
                mid++;
            else if(arr[mid]=='7')
            {
                char temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }
    }
}
