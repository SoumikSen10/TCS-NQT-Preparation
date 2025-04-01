/*

Given an array nums of size n, return the majority element. The majority element is the element that appears more than |_ n/3 _|
times. You may assume that the majority element always exists in the array.

Example 1:
Input : nums = [3,2,3,3]
Output : 3

Example 2:
Input : nums = [2,2,1,0,1,2,2,2,2]
Output : 2

*/

import java.util.*;

public class MajorityElements2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        List<Integer> ans = compute(arr,n);
        for(int el : ans)
            System.out.print(el + " ");
    }

    private static List<Integer> compute(int[] arr,int n)
    {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();


        int threshold = n / 3;

        for(int i=0;i<n;i++)
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);


        for(Map.Entry<Integer,Integer> el : freq.entrySet())
        {
            if(el.getValue()> threshold)
                ans.add(el.getKey());
        }

        return ans;

    }
}
