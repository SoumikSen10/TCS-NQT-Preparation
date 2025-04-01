/*

Alice has a unique problem. He has a string which contain elements for 0 to 9. Find the number of substrings of the string where sum of elements of the substring is not equal to the length of substring.

Examples :

Input 1 :
3 --> length of string
201 --> string

Output 1 :
3

=> {2 20 201 0 01 1} --> 3 (2 0 01)


*/

import java.util.Scanner;

public class UniqueProblem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        int ans = compute(str,n);
        System.out.print(ans);
    }

    private static int compute(String str, int n)
    {
        int count = 0;

        for(int i = 0; i < n; i++)  // Start index of substring
        {
            int sum = 0;

            for(int j = i; j < n; j++)  // End index of substring
            {
                sum += str.charAt(j) - '0'; // Compute sum dynamically
                int len = j - i + 1; // Length of substring

                if(sum != len)
                {
                    count++;
                }
            }
        }

        return count;
    }

//    private static int computeOptimized(String str, int n)
//    {
//        int count = 0;
//        int[] prefixSum = new int[n + 1];
//
//        // Calculate prefix sum
//        for (int i = 0; i < n; i++)
//        {
//            prefixSum[i + 1] = prefixSum[i] + (str.charAt(i) - '0');
//        }
//
//        // Check all substrings
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = i; j < n; j++)
//            {
//                int sum = prefixSum[j + 1] - prefixSum[i]; // Sum of substring str[i...j]
//                int len = (j - i + 1); // Length of substring
//
//                if (sum != len)
//                {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
