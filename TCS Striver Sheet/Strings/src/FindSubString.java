/*

Problem statement: “Given two strings text and pattern find the first occurrence of str1 in str2 if found print it’s index if not found print -1.”

Examples:

Example 1:
Input: str1 = "takeuforward"
       str2 = “forward”
Output: 5
Explanation: "Forward" is present in the 5th index in "takeuforward"

Example 2:
Input: str1 = “hello”
       str2 = “az”
Output: -1
Explanation: "az" is not a substring of "hello"

*/

import java.util.Scanner;

public class FindSubString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        int ans = substring(str1,str2);
        System.out.print(ans);

    }

    private static int substring(String s, String t)
    {
        int foundIndex = s.indexOf(t);
        return foundIndex;
    }

    private static int bruteSubString(String s, String t)
    {
        int n = s.length(), m = t.length();

        // Edge case: If pattern is longer than text, it can't be a substring
        if (m > n) return -1;

        // Try all possible starting points in 's'
        for (int i = 0; i <= n - m; i++)
        {  // Fix: Run up to (n-m) only
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != t.charAt(j))
                {  // Fix: Compare using (i + j)
                    break;
                }
            }
            if (j == m) return i;  // Found the full pattern
        }

        return -1;  // Pattern not found
    }
}
