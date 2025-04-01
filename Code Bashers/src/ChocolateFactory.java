/*

A chocolate factory is packing chocolates into packets. The chocolate packets here represent an array of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to end of the conveyer belt.

Example 1 :
N = 8
arr = [4,5,0,1,9,0,5,0]

Output 1:
4 5 1 9 5 0 0 0

Example 2 :
N = 6
arr = [0,0,1,2,4,5]

Output 2:
1,2,4,5,0,0

*/

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateFactory
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        compute(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void compute(int[] arr,int n)
    {
        int i=0,j=0;
        while(i<n)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
    }

}
