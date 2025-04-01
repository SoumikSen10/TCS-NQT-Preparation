/*

Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddEleArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            arr.add(x);
        }

        System.out.println("Insert at beginning : ");
        int a = in.nextInt();

        System.out.println("Insert at end : ");
        int b = in.nextInt();

        System.out.println("Insert at position : ");
        int c = in.nextInt();
        int p = in.nextInt();

        insertbeginning(arr,a);
        insertending(arr,b);
        insertatpos(arr,c,p);

        for(int num : arr)
            System.out.print(num + " ");

    }

    private static void insertbeginning(List<Integer> arr,int a)
    {
        arr.add(0, a); // Directly insert at index 0
    }

    private static void insertending(List<Integer> arr,int b)
    {
        arr.add(b); // Directly append to the end
    }

    private static void insertatpos(List<Integer> arr,int c,int p)
    {
        if (p > 0 && p <= arr.size() + 1)
        {
            arr.add(p - 1, c); // Insert at given position (1-based index)
        }
        else
        {
            System.out.println("\nInvalid position for insertion: " + p);
        }
    }
}
