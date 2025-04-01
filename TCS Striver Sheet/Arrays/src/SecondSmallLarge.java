/*

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

*/

import java.util.Scanner;

public class SecondSmallLarge
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int secSmall = findSecondSmallest(arr,n);
        int secLarge = findSecondLargest(arr,n);

        System.out.println("Second Smallest : "+secSmall);
        System.out.print("Second Largest : "+secLarge);
    }

    private static int findSecondSmallest(int arr[],int n)
    {
        if(n<2)
            return -1;

        int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i]<secondSmall && arr[i]!=small)
                secondSmall = arr[i];

        }

        return secondSmall;

    }

    private static int findSecondLargest(int arr[],int n)
    {
        if(n<2)
            return -1;

        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i]>secondLarge && arr[i]!=large)
                secondLarge = arr[i];
        }
        return secondLarge;
    }

}
