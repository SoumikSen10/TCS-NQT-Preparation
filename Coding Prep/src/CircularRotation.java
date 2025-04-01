/*

John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right.

To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation several times and then determine the value of the element at a given position.

For each array, perform several right circular rotations and return the value of the element at a given index.

Examples

Input Values :

array a = [3,4,5]
Number of rotations, k = 2
Indices to check, m = [1,2] // 0 - based indexing

Output Values : 5,3

*/

import java.util.Scanner;

public class CircularRotation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int k = in.nextInt();

        int x = in.nextInt();

        int indices[] = new int[x];

        for(int i=0;i<x;i++)
            indices[i]=in.nextInt();

        if(k>n)
            k = k%n;

        rotate(arr,n,k);

        for(int i = 0;i<x;i++)
        {
            int index = indices[i];
            System.out.println(arr[index]);
        }
    }

    private static void rotate(int[] arr, int n, int k)
    {
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    private static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
