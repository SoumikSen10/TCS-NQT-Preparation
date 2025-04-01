/*

Sort an array according to the order defined by another array

Given two arrays arr1[] and arr2[] of size m and n, the task is to sort arr1[] such that the relative order among the elements matches the order in arr2[]. For elements not present in arr2[], append them at the end in sorted order.

Example:

Input: arr1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
           arr2[] = {2, 1, 8, 3}
Output: arr1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}


Input: arr1[] = {4, 5, 1, 1, 3, 2}
           arr2[] = {3, 1}
Output: arr1[] = {3, 1, 1, 2, 4, 5}



*/

import java.util.*;

public class SortOrderBasedAnotherArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        List<Integer> arr1 = new ArrayList<>();

        for(int i=0;i<n1;i++)
        {
            int a = in.nextInt();
            arr1.add(a);
        }


        int n2 = in.nextInt();
        List<Integer> arr2 = new ArrayList<>();

        for(int i=0;i<n2;i++)
        {
            int b = in.nextInt();
            arr2.add(b);
        }


        List<Integer> ans = compute(arr1,arr2);

        for(int num : ans)
            System.out.print(num+" ");
    }

    private static List<Integer> compute(List<Integer> arr1,List<Integer> arr2)
    {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedArr1 = new ArrayList<>();

        // Place elements of arr2 in sortedArr1 based on frequency
        for (int num : arr2) {
            while (freq.getOrDefault(num, 0) > 0) {
                sortedArr1.add(num);
                freq.put(num, freq.get(num) - 1);
            }
            freq.remove(num);
        }

        // Collect remaining elements
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            while (entry.getValue() > 0) {
                remaining.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);
            }
        }

        // Sort and append remaining elements
        Collections.sort(remaining);
        sortedArr1.addAll(remaining);

        return sortedArr1;

    }
}


/*

Store Frequency of arr1[] Elements:
 Use a HashMap<Integer, Integer> to count occurrences of each element in arr1[].

Sort arr1[] According to arr2[]:
 Iterate over arr2[] and check if the element exists in the frequency map.

If present, append it to sortedArr1 as many times as it appears in arr1[].

Remove the element from the frequency map after processing.

Sort Remaining Elements Not in arr2[]:
Collect remaining elements from the frequency map into a new list.

Sort this list in ascending order.

Append Remaining Elements to sortedArr1[]:
Merge the sorted remaining elements at the end of sortedArr1[].

Return sortedArr1[] as the final sorted array.

*/