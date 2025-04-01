/*

Problem:  Given a string, print non-repeating characters of the string.

Examples:

Example 1:
Input: string = “google”
Output: l,e

Explanation: Non repeating characters are l,e.

Example 2:
Input: string = “yahoo”
Output: y,a,h
Explanation: Non repeating characters are y,a,h

*/

import java.util.Scanner;

public class NonRepeatingChars
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        non_repeating(str);
    }

    private static void non_repeating(String str)
    {
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]==1)
                System.out.print((char)(i+'a') + " ");
        }

    }
}
