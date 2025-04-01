/*

Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

Examples:

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times, so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

*/

import java.util.*;

public class SortElementsFreq
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        sortFreq(arr,n);
    }

    private static void sortFreq(int[] arr,int n)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Pair> freqPairs = new ArrayList<>();
        for(int el : map.keySet())
        {
            freqPairs.add(new Pair(el,map.get(el)));
        }

        //sorting based on decreasing order of freq followed by increasing order of elements

        Collections.sort(freqPairs,(a,b)->{
            if(a.second==b.second)
                return a.first - b.first;
            else
                return b.second - a.second;
        });

        for(int i=0;i<freqPairs.size();i++)
        {
            while (freqPairs.get(i).second>0)
            {
                System.out.print(freqPairs.get(i).first+" ");
                freqPairs.get(i).second--;
            }
        }

    }
}

class Pair
{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}